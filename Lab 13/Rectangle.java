
public class Rectangle extends Shape{

	private int width; 
	private int height; 
	
	Rectangle(String color, int width, int height){
		setColor(color);
		this.width = width;
		this.height = height;
		
		//Creates the new Rectangle and gives value to the instance variables
	}
	int getWidth(){
		return width; 
		
	}

	 void setWidth(int newWidth){
		  width=newWidth; 
	  }

	int getHeight(){
		return height; 
	}

	void setHeight(int newheight){
		height=newheight;
	}
		
	public String toString(){
		String output = "";
		output +=("SHAPE INFO\n"); 
		output +=("Shape: Rectangle"+ "\n"); 
		output +=("Color: " + getColor()+ "\n"); 
		output +=("Width:" + getWidth()+ "\n"); 
		output +=("Height:" + getHeight())+ "\n"; 
		output +=("Area:" + calculateArea()+ "\n"); 
		return output;
		}
	

	double calculateArea(){
		double area= getWidth()*getHeight();
		return area; 
		
	}
				


	

}
