package day2.examples;

public class Box3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Box3 ups = new Box3();
	Box3 fedEx = new Box3();
	
	ups.length = 5;
	ups.width = 10;
	int area1 = ups.calculateArea(5,5);
	
	fedEx.length = 10;
	fedEx.width = 20;
	int area2 = fedEx.calculateArea(2,4);
	
	System.out.println(area1 + area2);
	
	}

}
