package day2.examples;

public class SmallBox {

	int length;
	int width;
	//Constructor is a method that has no name
	//it is executed when an object is created 
	//it is used to set default values
	//does not return anything including void
	
	SmallBox(){
		this.length = 5;
		this.width = 5;
		System.out.println("Constructor Fired");
	}
	
	SmallBox(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	void calculateArea() {
		System.out.println("Area = " + length*width);
	}
}
