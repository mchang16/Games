import java.util.Scanner;


public class AirPlaneFlight {
	//Scanner input = new Scanner(System.in);
	
	String departDest;
	String arrivalDest;
	double etd;
	double eta;
	
	AirPlaneFlight(String departDest1, String arrivalDest1, double etd1, double eta1){
		departDest1=departDest;
		arrivalDest1=arrivalDest;
		etd1=etd;
		eta1=eta;
		
	//input.close(); 
		
	}
	
	public void displayFlight(){
		
		System.out.println("Departing Destination : Gainesville, Florida" );
		System.out.println("Arrival Destination:" + arrivalDest);
		System.out.println("Estimated Time of Depature" + etd);
		System.out.println("Estimated Time of Arrival" + eta);
		
		
	}
	
	
	public static AirPlaneFlight createFlight(){
		
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Please Enter Flight Information");
		
		System.out.println("Arrival Destination:");
		String arrivalDest = input2.nextLine();
		
		System.out.println("Estimated Time of Depature:");
		 double etd2 = input2.nextDouble();
		
		 System.out.println("Estimated Time of Arrival:");
		  double eta2 = input2.nextDouble();
		
		AirPlaneFlight myObject = new AirPlaneFlight("Gainesville, Florida", arrivalDest, etd2, eta2);
		
	//	input2.close();
		
		return myObject; 
		
		
	}
	
	
	public static AirPlaneFlight changeFlight(){
		
		Scanner input = new Scanner(System.in);
		
        System.out.println("Please Enter Flight Information");
		System.out.println("New Arrival Destination");
		String arrivalDest = input.nextLine();
		
		System.out.println("New Estimated Time of Depature");
		 double etd2 = input.nextDouble();
		
		 System.out.println("New Estimated Time of Arrival");
		  double eta2 = input.nextDouble();
		
		  AirPlaneFlight myObject = new AirPlaneFlight("Gainesville, Florida", arrivalDest, etd2, eta2);
			
		return myObject; 
		
	}
	
	public static String formatTime(double time){
		
		String NewTime= Double.toString(time);
		NewTime.replace('.',':'); 
		String TimeFinal= NewTime.substring(0,5);
		return TimeFinal;
		
	}

}
