import java.util.Scanner;

public class LucyTattooParlor {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		int numArtists = Integer.parseInt(args[0]);      //converts command line arguments from String to Decimal
		int maxCustomerNum = Integer.parseInt(args[1]);

		TattooCustomer[][] customer = new TattooCustomer[numArtists][maxCustomerNum]; //makes 2-D array waitlist

		String inputName = "";

		while (true) {            //keeps prompting the user repeatedly

			int inputArtistNum = 0;
			String second = "";

			System.out.println("Please enter name.");  //Prompts user for information
			inputName = input.nextLine();

			if (inputName.equalsIgnoreCase("Print Waitlist")) {  //Prints the waitlist if input is "Print Waitlist"
				break;

			}

			System.out.println("What would you like a tattoo of?");
			String inputTattoo = input.nextLine();
			System.out.println("Do you have a specific artist in mind?");
			String answer = input.nextLine();

			if (!answer.equalsIgnoreCase("Yes") && !answer.equalsIgnoreCase("No")) {//Keep asking for artist until yes or no is said
				do {
					System.out.println("Do you have a specific artist in mind?");
					second = input.nextLine();
				} while (!second.equalsIgnoreCase("Yes") && !second.equalsIgnoreCase("No"));

			}

			boolean wantArtist = false;   //checks if they want an specific artist or not

			if (answer.equalsIgnoreCase("yes") || second.equalsIgnoreCase("yes")) {    
				System.out.println("Which number artist?");
				inputArtistNum = input.nextInt();
				wantArtist = true;

			}

			System.out.println("How many minutes will it take?");
			int inputTime = input.nextInt();

			String extraInput = input.nextLine();  //fixes the while loop when asking for name input
			
			TattooCustomer object = new TattooCustomer(inputName, inputTattoo, inputTime);  //Creates TattooCustomer object

			if (wantArtist) {                                   
				addCustomer(customer, object, inputArtistNum);  //adds customer to specified artist
			} else {
				addCustomer(customer, object);                  //adds customer if no specified artist requested
			}

		}

		int counter = -1;

		//prints waitlist
		for (int printI = 0; printI < customer.length; printI++) { 

			counter += 1;
			System.out.println("\n");
			System.out.println("Artist " + counter);

			for (int printJ = 0; printJ < customer[printI].length; printJ++) {

				if (customer[printI][printJ] != null) {                     //If not empty, print the name of person
					System.out.println(customer[printI][printJ].getName());

				} else if (customer[printI][printJ] == null) {              //If empty, print "empty"
					System.out.println("empty");
				}
			}
		}
	}

	/**
	 * Computes how many minutes of work the specified tattoo artist has.
	 * 
	 * @param a
	 *            The array of customers for one particular tattoo artist
	 * 
	 * @return minutes of work for an artist
	 * 
	 */
	public static int computeMinutesOfWork(TattooCustomer[] a) {
		// TODO

		int total = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] != null) {
				total += a[i].getMinutes();  //computes total minutes for each artist
			}
		}

		return total;
	}

	/**
	 * Adds customer to the waitlist for a specific artist. If the artist is at
	 * capacity (in terms of number of customers or minutes),then the customer
	 * is not added and the method returns false. If the customer is
	 * successfully added the method returns true
	 * 
	 * @param a
	 *            Accesses the 2-D array waitlist.
	 * @param c
	 *            The customer object.
	 * @param artistNum
	 *            Number assigned to each artist/ row.
	 * 
	 * @return true if requested artist is not full and doesn't go over 8 hours.
	 *         Returns false if requested artist is full, or exceeds 8 hour work
	 *         time.
	 */

	public static boolean addCustomer(TattooCustomer[][] a, TattooCustomer c, int artistNum) {
		

		for (int column = 0; column < a[artistNum].length; column++) {

			if (a[artistNum][column] == null) {//if spot is empty
				if (computeMinutesOfWork(a[artistNum]) + c.getMinutes() < 480) {//And if added is less than 8 hours

					a[artistNum][column] = c; //Adds customer to requested artist list

					return true;
				}

			}

		}
		return false;

	}

	/**
	 * Adds customer to the shortest waitlist in terms of minutes. If some
	 * artists have equal length waitlists then the customer is added to the
	 * lowest numbered artist. If no artist has space then the method does not
	 * add the customer, and returns false.
	 * 
	 * 
	 * @param a
	 *            2-D array waitlist
	 * @param c
	 *            customer object
	 * 
	 * @return true if the customer was added to the waitlist. Returns false if
	 *         all artist's waitlists are full
	 * 
	 */

	public static boolean addCustomer(TattooCustomer[][] a, TattooCustomer c) {
		
		int min = computeMinutesOfWork(a[0]); //assuming a[0] is minimum at first
		int whichRow = 0;
		
		// Finds min time and index
		for (int row = 0; row < a.length; row++) {

			int minutesPerRow = computeMinutesOfWork(a[row]);//finding the minutes for each customer

			if (min > minutesPerRow) { //comparing the first spot to the next spot to find shortest row

				min = minutesPerRow;//if the next spot is less, set it equal to min (making it the new min).
				whichRow = row; //knows which row is the shortest now

			}
		}
			// find null spot to place if time doesn't exceed 8hrs
			for (int column = 0; column < a[whichRow].length; column++) {

				if (a[whichRow][column] == null) {     //if currently there is an empty spot

					if (computeMinutesOfWork(a[whichRow]) + c.getMinutes() < 480) { //if added time and total time do not exceed 8 hours

						a[whichRow][column] = c;//Adds the customer into shortest waitlist/row

						return true;

					}

				}

			}

		

		return false;
	}
}
