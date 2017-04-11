//Made by Michelle Chang and Dania Etienne

import java.util.Scanner; 

public class Calculator {

public static void main(String[] args){

Scanner input =new Scanner(System.in);

System.out.println("What number would you like to stop at (as an interger) ?" );

int Total = input.nextInt(); 

System.out.println("Enter a starting number: " );

int origin = input.nextInt(); 

int newTotal = 0; 

while (newTotal< Total) {

System.out.println("What operation would you like to do  ? Multiplication(*), Division(/),Subtraction (-), or Addition(+)"); 

String Operation= input.next(); 

if (Operation.equals("*") ){ 

System.out.println("Enter your new number: " );

int newNumber= input.nextInt();  

newTotal=newTotal + (origin*newNumber) ; 

System.out.println("Your running total is: " + newTotal);

}

if (Operation.equals("/") ){ 

System.out.println("Enter your new number: " );

int newNumber= input.nextInt();  

newTotal = newTotal+ (origin/newNumber) ; 

System.out.println("Your running total is: " +newTotal);

}

if (Operation.equals("-") ){ 

System.out.println("Enter your new number: " );

int newNumber= input.nextInt();  

newTotal=newTotal +(origin-newNumber); 

System.out.println("Your running total is: " +newTotal);

}

if (Operation.equals("+") ){ 

System.out.println("Enter your new number: " );

int newNumber= input.nextInt();  

newTotal= newTotal + (origin + newNumber); 

System.out.println("Your running total is: " +newTotal);

}

else if ((!Operation.equals("*"))|| !(Operation.equals("/"))|| (!Operation.equals ("-")) || (!Operation.equals ("+"))){

System.out.println(" Invalid Operation!" );

}

if (newTotal>=Total){

System.out.println("Your final result is " + newTotal); 

} 

}

input.close();

}


}