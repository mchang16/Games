import java.util.Scanner;

public class JavaAirlines {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Hello and Welcome to Java Airlines!\nWhat will be the flight schedule for today?\n");
		
		//Make the three airplane flights
		AirPlaneFlight flight1=AirPlaneFlight.createFlight();
		AirPlaneFlight flight2=AirPlaneFlight.createFlight();
		AirPlaneFlight flight3=AirPlaneFlight.createFlight();
		
		while (true){
			System.out.println("\nMain Menu"); 
			System.out.println("1. View Plane Flight");  
			System.out.println("2. Change Flight Information");
			System.out.println("3. Exit");

			System.out.print("\nInput: ");
			int option = input.nextInt();
			System.out.println();
			
			//View Plane Flight
			if (option==1){
				System.out.println("Enter Flight Number:");
				int flightnumber= input.nextInt(); 
				if(flightnumber==1){
					flight1.displayFlight();
				}
				else if(flightnumber==2){
					flight2.displayFlight();
					
				}
				else if(flightnumber==3){
					flight3.displayFlight();
				}
				
			}
			
			//Change Flight
			else if (option==2){
				System.out.println("Enter Flight Number:");
				int flightnumber= input.nextInt(); 
				if(flightnumber==1){
					flight1=AirPlaneFlight.changeFlight();
				}
				else if(flightnumber==2){
					flight2=AirPlaneFlight.changeFlight();
					
				}
				else if(flightnumber==3){
					flight3=AirPlaneFlight.changeFlight();
				}
				
			}
					
			//Exit
			else if (option == 3){
				System.out.println("Thank you  for flying with Java Airlines!");
			}
		}
	}
}


