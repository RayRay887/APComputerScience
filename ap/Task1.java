package ap;

public class Task1 {

	public void solution(int n, int[] a) {
		int[] b = new int[n];
		for (int x = 0; x < a.length; x++) {
			if (a[x+1] > a.length)
				a[x+1] = 0;
			if (a[x-1] < 0)
				a[x-1] = 0;
			
			b[x] = a[x-1] + a[x] + a[x+1];
		}
		for (int element : a) {
			System.out.println(element);
		}
	}
}
