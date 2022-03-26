package day1.examples;

public class AndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x,y;
		x = 10;
		y = -10;
		
		if(x > 0 && y > 0) {
			System.out.println("Both are positive");
		}else if(x > 0 || y > 0) {
			System.out.println("One is positive");
		} else {
			System.out.println("Both are negative");
		}
		
	}

}
