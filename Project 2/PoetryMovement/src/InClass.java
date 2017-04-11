
public class InClass {

	public static void main (String [] myArgs){
		
		//the array myArgs noow stores the comman line parameters
		//so its contents are Strings, depending on what the user entered.
		
		//assumption: 3 operators, operand,operator,operand.
		
		//myArgs[0] stores the first operand
		//myArgs[1] stores the operator
		//myArgs[2] stores the second operator
		
//		int operand1 = Integer.parseInt(myArgs[0]);
//		int operand2 = Integer.parseInt(myArgs[2]);
//
//		
//		
//		
//		switch(myArgs[1].charAt(0)){
//			
//		case ('+'): System.out.println(myArgs[0] + myArgs[2]); break;
//		case('-'): System.out.println(operand1 - operand2);
//		case ('/'):System.out.println(operand1 / operand2);
//		case('*'): System.out.println(operand1 * operand2);
		
		
		//}
		}
	
 public static void InitWith(int [][] x,int num){
	 
	 for (int i = 0; i< x.length; i++  ){
		 
		 for(int j = 0; j< x[i].length; j++){
			 
			 x[i][j] = 11;
			 
			 
		 }
		 
		 
		 
	 }
	 
 } 
 
 public static void print2DArray(String [][] x){
	 
	 for(int i = 0; i<x.length; i++){
		 for(int j = 0; j< x[i].length;j++){
			 System.out.println(x[i][j]);
			 
				System.out.println();

		 }
		 
		 
		 
	 }
	 
	 
 }
 public static void sumArray (int [][]y){
	 
	 int sum = 0;
	 int row = 0;
	 
	 for(int col = 0; col<y[row].length; col++){
		 for( row = 0; row< y.length;row++){
               sum+=y[row][col];
	
			 
	 
	 
 }
		 row = 0;
		 System.out.println(sum);
	
	}
	
 }
 
 //The array must not be null

public static void sumArray2 (int [][]y){
	 
	 int numCols = y[0].length;
	 
	 for(int col = 0; col<numCols; col++){
		 int sum = 0;
		 for(int row = 0; row< y.length;row++){
              sum+=y[row][col];
	
			 
	 
	 
}
		 System.out.println(sum);
	
	}
 
}
}