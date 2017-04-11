
public class Circle extends Shape{

	private int radius; 
	
	Circle(String color, int radius){
		setColor(color);
		this.radius=radius;  
	}
	int getRadius() {
		return radius;
	}

	void setRadius(int newRadius){
		radius = newRadius;
	}

	public String toString(){
		String output = "";
		output+="SHAPE INFO\n"; 
		output += "Shape: Cicle\n"; 
		output +=("Color:" + getColor() + "\n");  
		output += ("Radius:" + getRadius() +"\n"); 
		output +=("Area:" + calculateArea() + "\n"); 
		return output; 
	}
		

	double calculateArea(){
		double area= (Math.PI)*getRadius()*getRadius(); 
		return area; 
	}
				
	
}
