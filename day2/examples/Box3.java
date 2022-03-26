package day2.examples;

public class Box3 {

	int length;
	int width;
	
	//void means there is no return function at the end
	
	int calculateArea(int length, int width) {
		int area = this.length*this.width;
		//dont use this. if you want the data from the parameters of the functions istead of the data fromw hen you set up the variable
		System.out.println("Total Area = " + area);
		return area;
	}
	
}
