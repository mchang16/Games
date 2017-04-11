

class Lecture{

	public static void main (String [] args){
String s1 = "Boo!";
String s2 = "Apple!";

char c1 = 'B';
char c2 = 'C';

System.out.println("String" + s1 + "comes before" + s2 + "is" + comesBefore(s1,s2));
System.out.println("char" + c1 + "comes beofre " + c2 + "is" + comesBefore(c1,c2));
	}
	
public static boolean comesBefore(String param1, String param2){

	if (param1.compareTo(param2) < 0){ //compareTO is negative if the x.compareTo x String comes before the one in parenthesis
		return true;}
		else return false;
	}


public static boolean comesBefore(char param1, char param2){

		if (param1 < param2){
			return true;
		}
		else return false;	


}


}
