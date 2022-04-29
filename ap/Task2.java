package ap;

public class Task2 {

	public static boolean solution(int[] numbers) {
		int temp2 =0;
		
		for (int x = 0; x < numbers.length; x++) {
			temp2 = numbers[x];
			numbers[x] = reverse(numbers[x]);
			if (isIncreasing(numbers)) {
				return true;
			} else {
				numbers[x] = temp2;
			}
		}
		return false;
	}
	
	public static int reverse(int n) {
		int reverse = 0;
		while (n > 0) {
			int temp = n % 10;
			reverse = reverse * 10 + temp;
			n = n / 10;
		}
		return reverse;
	}
	
	public static boolean isIncreasing(int[] a) {
		for (int x = 0; x < a.length; x++) {
			if (a[x+1] < a[x]) {
				return false;
			}
		}
		return true;
	}
}
