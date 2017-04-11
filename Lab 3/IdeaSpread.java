//This program computes the number of retweets that will result from four rounds of tweeting. It was created by Dania Etienne and Michelle Chang

import java.util.Scanner;


public class Retweets {

public static void main (String [] args){	

	//Made by Dania Etienne and Michelle Chang. 

	System.out.println("How many followers do you have to share your tweet with ?");
	Scanner scan = new Scanner(System.in);
	
	int followers = scan.nextInt();
	
	double decimal = Math.random();
	
	double percentage= (int) (decimal*1000)/10.0; 
	
	System.out.println("We estimate this percentage of your followers will share your tweet " + percentage + "%" );

	double Factor = decimal*followers;  
	
	System.out.println("From the first round of posting we estimate " + (int)Factor +  " shares." );
	
	
	int Total = (int)Factor;
	
	 Total += Math.pow(Factor,2); 
	
	 Total +=Math.pow(Factor,3); 
	 
	 Total +=Math.pow(Factor,4);
	 
	 System.out.println("Projecting four rounds into the future " + Total + ".") ;

	scan.close();
	
	
	
}
}