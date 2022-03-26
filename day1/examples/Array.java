package day1.examples;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int a = 10; 
		 * int b = 20; 
		 * int c,d; 
		 * c = 30; 
		 * d = 40;
		 */
		
		int[] a = {10,20,30,40,50};
		System.out.println(a[2] + a[4]);
		
		for(int temp : a) {  
			System.out.println(temp);
			
		}
		
		int[] x = new int[5];
		x[3] = 5;
		x[0] = 27;
		
		for(int temp2 : x) { 
			System.out.println(temp2);
		}
		
		String[] stx = new String[5];
		stx[3] = "HEY";
		stx[0] = "BYE";
		
		for(String temp3: stx) {
			System.out.println(temp3);
		}
		
	}

}
