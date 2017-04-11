abstract class  Shape {
	private String color;
	
	Shape(){
		
	}
	
	Shape (String color){
		color= this.color;
	}
	String getColor(){
		return color; 
	}

	void setColor(String newColor){
	 color= newColor;
	}
		
	public String toString(){
		
		return color;
	}
	abstract double calculateArea();

}
