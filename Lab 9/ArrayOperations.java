import java.util.Scanner;
public class ArrayOperations {


	public static void main (String [] args){


	Scanner input=new Scanner(System.in);

	System.out.println("Please enter the desired max random value: "); 

	int inputMaxNum = input.nextInt();
	System.out.println("Please enter the desired size of the array: "); 
	
	int inputSizeArray = input.nextInt();
	
	int [] array = generate (inputMaxNum,inputSizeArray);
	
	display(array); 

    reverse(array);
    
    display(array);


	}

	public static int [] generate(int maxRand, int arraySize){
		int [] primeArray = new int [arraySize];
		for (int i=0;i< primeArray.length; ++i){
			double rand=0; 
			do {
			rand=Math.random()*(maxRand+1);
			}while (rand >  maxRand);
			
			if ( rand <= maxRand){
			primeArray [i]= (int)rand; 
			
			}
			}
		return primeArray;
	}
	
	
	public static void display(int [] intArray){
	
		for(int i = 0; i < intArray.length; i++){
			if (i==0){
				System.out.print("[" +intArray[i] + ",");
			}
			else {
			if (i==(intArray.length-1)){
				System.out.print(+intArray[i]+"]");
			}
			else{
				System.out.print( +intArray[i]+ ",");
			}
			}
			}
		}

	public static void reverse (int [] reverseArray){
		
		int arraySize = reverseArray.length;
		
		int[] newArray = new int [arraySize];
		int length=arraySize; 
		
		for (int i = 0; i < arraySize; i++){
			newArray [i]= reverseArray[length-1];
			length--;	
			}
		for (int i = 0; i < arraySize; i++){
		reverseArray[i]=newArray[i]; 
	

		}
	
	}
		




}

	


	