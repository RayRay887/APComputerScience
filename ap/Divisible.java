package ap;

public class Divisible {

	private int number;
	private int sum = 0;
	
	public Divisible () {
	}
	
	public boolean isDivisible(int myNumber) {
		number = myNumber;
		String numberVTwo = String.valueOf(number);
		for (int i; i < numberVTwo.length; i++) {
			sum = numberVTwo.substring(i,i-1);
		}
		
		if (sum <= 9) {
			if (sum % 9 == 0) {
				return true;
			} else {
			isDivisible(sum);	
			}
		} 
	}
	
}
