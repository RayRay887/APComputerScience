package day1.examples;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		//even if x =-10 the DoWhile statement will still run once
		
		do{
			System.out.println("x = "+ x);
			x--;
		}while(x>0);
		
	}

}
