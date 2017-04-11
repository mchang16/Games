
public class Triangle extends Shape {
	
private int base; 
private int height; 

Triangle(String color, int base, int height){
	setColor(color);
	this.base=base; 
	this.height=height; 
}
int getBase() {
	return base; 
}

void setBase(int newBase){
	base=newBase;
}

int getHeight(){
	return height;
}

void setHeight(int newheight){
	height=newheight; 
}
	
public String toString(){
		
	
	
	System.out.println("SHAPE INFO"); 
	String output=""; 
		output += "Shape: Triangle\n"; 
		output +="Color:"+getColor()+ "\n"; 
		output +="Base:"+getBase()+ "\n"; 
		output +="Height:" +getHeight()+ "\n"; 
		output +="Area:"+calculateArea()+ "\n";
		return output;
	}

double calculateArea(){
	double area = .5*getBase()*getHeight();
	return area;
}


}
