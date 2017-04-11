//Created by Michelle Chang

import java.util.Scanner;


public class Project1 {

	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);
		
		//Gets x-coordinate from Drone 1
		System.out.println("Please enter the x coordinate of Drone 1:");
		double droneX1 = input.nextFloat(); 
		
		
		//Gets y-coordinate from Drone 1
		System.out.println("Please enter the y coordinate of Drone 1:");
		double droneY1 = input.nextFloat();
		
		
		//Gets altitude from Drone 1
		System.out.println("Please enter the altitude of Drone 1:");
		double droneAltitude1 = input.nextFloat();
		
		
		//Gets x-coordinate from Drone 2
		System.out.println("Please enter the x coordinate of Drone 2:");
		double droneX2 = input.nextFloat();
		
		
		//Gets y-coordinate from Drone 2
		System.out.println("Please enter the y coordinate of Drone 2:");
		double droneY2 = input.nextFloat();
		
		
		//Gets altitude from Drone 2
		System.out.println("Please enter the altitude of Drone 2:");
		double droneAltitude2 = input.nextFloat();
		
		
		//Gets distance in X direction
		double xDifference = Math.pow(droneX2 - droneX1,2);
		
		
		//Gets distance in Y direction
		double yDifference = Math.pow(droneY2 - droneY1,2);
		
		
		//Gets distance in Z direction (altitude)
		double zDifference = Math.pow(droneAltitude2 - droneAltitude1,2);
		
		//Combines all the distances
		double distanceForXY = Math.pow((xDifference + yDifference),.5);

		
        //Prints distance in (x,y)
		System.out.print("The two drones are " + distanceForXY + "feet apart in (x,y) coordinates." );
		
		if (distanceForXY < 1){
			System.out.println(" They need to move farther apart in (x,y).");
				}
		
	    if(distanceForXY > 500){
					System.out.println(" They need to move closer together in (x,y).");
				}
		
		if(distanceForXY >= 1 && distanceForXY <= 500){
			System.out.println(" They do not need to move farther apart or closer together in (x,y).");
				}
		
		
		
		//Gets distance in 3D
		double distance3D = Math.pow((xDifference + yDifference + zDifference),.5);

		//Prints 3D distance
		System.out.print("The two drones are " + distance3D + " feet apart in 3D space." );
		
		
		if (distance3D < 1){System.out.println(" They need to move farther apart.");
				}
		
		
		if (distance3D > 500){System.out.println(" They need to move closer together.");
				}
		
		
		if(distance3D >= 1 && distance3D <= 500){System.out.println(" They do not need to move farther apart or closer.");
           		}
		}
}

	