package day2.examples;

public class Box2 {

	int length;
	int width;
	
	//void means there is no return function at the end
	
	int calculateArea() {
		int area = length*width;
		System.out.println("Total Area = " + area);
		return area;
	}
	
}
