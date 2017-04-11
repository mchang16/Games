
public class Fruit {
	
private String name; 
private String color; 
private int weight; 
private boolean cut; 

Fruit (String name, String color, int weight, boolean cut ){
	this.name=name; 
	this.color=color; 
	this.weight=weight; 
	this.cut=cut;
}
Fruit(String name, String color){
	this.name=name; 
	this.color=color; 
	this.weight=1; 
	this.cut=false;
}

public String getName() {
	return name;
}
public void setName(String name) {
	name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	color = color;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public boolean isCut() {
	return cut;
}
public void setCut(boolean cut) {
	this.cut = cut;
}
 
}
