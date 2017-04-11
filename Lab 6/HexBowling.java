//By Michelle Chang and Tim Crowley

import java.util.Scanner;

public class HexBowling {
public static void main (String [] args){
	
	Scanner input = new Scanner (System.in);
	
	System.out.println("WELCOME TO HEXBOWLING!!!!");
	System.out.println("How Many Games would you like to bowl today?");
	int games = input.nextInt();
	
	System.out.println("How Many frames would you like to bowl?");
    int frames = input.nextInt();
    
    
    for (int i = 0; i <games; i++){
   for(int j = 0; j<frames; j++ ){
    int pins = 15;
    int throw1 = (int)( Math.random()*pins);
    int pinsOne = pins - throw1;
    int throw2 = (int)( Math.random()*pinsOne);
    int pinsTwo = pinsOne - throw2;
    int throw3 = (int)( Math.random()*pinsTwo);

    
    
    
    double frameScore = throw1 + throw2;
    if (frameScore < 15){
        throw3 = (int)( Math.random()*16);
}

    double frameScore2 = throw1 + throw2 + throw3;
   
    if(frameScore2 > 15){
    	double totalPins = 15;
    } 
    
    String throwOne = "throwOne";
   
    switch(throw1){
    
    case 0 : throwOne = "0";break;
    
    case 1 : throwOne = "1";break;
    
    case 2 : throwOne = "2";break;
    
    case 3 : throwOne = "3";break;
    
    case 4 : throwOne = "4";break;
    
    case 5 : throwOne = "5";break;
    
    case 6 : throwOne = "6";break;
    
    case 7 : throwOne = "7";break;
    
    case 8 : throwOne = "8";break;
    
    case 9 : throwOne = "9";break;
    
    case 10: throwOne = "A";break;
   
    case 11: throwOne = "B";break;
    
    case 12 : throwOne = "C";break;
    
    case 13 : throwOne = "D";break;
    
    case 14 : throwOne = "E";break;
    
    case 15 : throwOne = "F";break;
    
    }

    String throwTwo = "throwTwo";
    
    switch(throw2){
    
    case 0 : throwTwo = "0";break;
    
    case 1 : throwTwo = "1";break;
    
    case 2 : throwTwo = "2";break;
    
    case 3 : throwTwo = "3";break;
    
    case 4 : throwTwo = "4";break;
    
    case 5 : throwTwo = "5";break;
    
    case 6 : throwTwo = "6";break;
    
    case 7 : throwTwo = "7";break;
    
    case 8 : throwTwo = "8";break;
    
    case 9 : throwTwo = "9";break;
    
    case 10: throwTwo = "A";break;
   
    case 11: throwTwo = "B";break;
    
    case 12 : throwTwo = "C";break;
    
    case 13 : throwTwo = "D";break;
    
    case 14 : throwTwo = "E";break;
    
    case 15 : throwTwo = "F";break;
    
    }

 String throwThree = "throwThree";
    
    switch(throw3){
    
    case 0 : throwThree = "0";break;
    
    case 1 : throwThree = "1";break;
    
    case 2 : throwThree = "2";break;
    
    case 3 : throwThree = "3";break;
    
    case 4 : throwThree = "4";break;
    
    case 5 : throwThree = "5";break;
    
    case 6 : throwThree = "6";break;
    
    case 7 : throwThree = "7";break;
    
    case 8 : throwThree = "8";break;
    
    case 9 : throwThree = "9";break;
    
    case 10: throwThree = "A";break;
   
    case 11: throwThree = "B";break;
    
    case 12 : throwThree = "C";break;
    
    case 13 : throwThree = "D";break;
    
    case 14 : throwThree = "E";break;
    
    case 15 : throwThree = "F";break;
    
    
    }
    int frame1Total = throw1 + throw2 + throw3;

    if(throwOne.equals("F")){
 
    	
    	System.out.println("WAAAHOOO what a Strike!");
    	
    }
   
   else if(frame1Total = 15){
    	System.out.println("Nice Spare!");
    	 }
    
    
    
    else if((throwOne.equals("0"))|| (throwTwo.equals("0")) || throwTwo.equals("0")){
    	System.out.println("Omg...a gutter ball");
    }
    	
    String frameOneTotal = throwOne + throwTwo + throwThree; 
    String frameTwoTotal = throwOne + throwTwo + throwThree; 
    String frameThreeTotal = throwOne + throwTwo + throwThree; 
    
    System.out.print("Game 1 Results: Frame 1   |  " + frameOneTotal  + "  |");
    
   
    
   }}
    
    System.out.println("What a Day! Thanks for playing!");
}
}
