package ap;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myArray = {4,0,1,-2,3};
		solution(5, myArray);
		
	}
	public static void solution(int n, int[] a) {
		int[] b = new int[n];
		for (int x = 0; x < a.length; x++) {
			if (x+1 == a.length) {
				b[x] = a[x-1] + a[x] + 0;
			}if (x-1 < 0) {
				b[x] = 0 + a[x] + a[x+1];
			} if (x-1 >= 0 && x+1 < a.length) {
				b[x] = a[x-1] + a[x] + a[x+1];
			}
		}
		for (int element : b) {
			System.out.println(element);
		}
	}
}
