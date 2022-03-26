package day2.examples;

public class BoxTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Box2 ups = new Box2();
	Box2 fedEx = new Box2();
	
	ups.length = 5;
	ups.width = 10;
	int area1 = ups.calculateArea();
	
	fedEx.length = 10;
	fedEx.width = 20;
	int area2 = fedEx.calculateArea();
	
	System.out.println(area1 + area2);
	
	}

}
