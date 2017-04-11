
class SimpleCircle {

double radius;  //member variable

//Behaviors(the methods)

public SimpleCircle(double radius){
	
	this.radius = radius; //ths.radius refers to the member variable(above) - the state 
	                      //radius refers to the parameter o this method,which got passed in.
	
	
}

public double getArea(){
	return radius*radius*Math.PI;
	
	
}

}
