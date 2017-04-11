
public class Lab13 {
 
public static void main (String args[]){
	
	Shape myShape;
	myShape = new Circle("purple",5);
	
	System.out.println(myShape.toString());
	
	
	myShape = new Rectangle("gray",8,11);
	System.out.println(myShape.toString());
	
	myShape = new Triangle("orange",5,10);
	System.out.println(myShape.toString());
}
}
