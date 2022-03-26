package day2.examples;

public class BoxTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Box ups = new Box();
	Box fedEx = new Box();
	
	ups.length = 5;
	ups.width = 10;
	ups.calculateArea();
	
	fedEx.length = 10;
	fedEx.width = 20;
	fedEx.calculateArea();
	
	
	}

}
