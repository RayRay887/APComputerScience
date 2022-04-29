package ap;

import ap.Parent;
import ap.Children;

public class Mean {
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] crypt = {"mom", "mom", "oeo"};
		String[][] solution = {{"m", "1"},{"o", "2"},{"n", "5"}, {"e", "4"}, {"y", "9"}};
		System.out.println(decrypt(crypt, solution));
		
	}

	static boolean decrypt(String[] crypt, String[][] solution) {
		String temp = "";
		int[] arr = new int[crypt.length];
		for (int x = 0; x < crypt.length; x++) {
			temp = "";
			for (int y = 0; y < crypt[x].length(); y++) {
				 for (int z = 0; z < solution.length; z++)
					 if (crypt[x].substring(y, y+1).equals(solution[z][0])) {
						 temp = temp + solution[z][1];
					 }
			}
			arr[x]= Integer.parseInt(temp);
		}
		
		if (arr[0] + arr[1] == arr[2]) {
			return true;
		}
		return false;
	}
	*/
	/*
	public static void main(String[] args) {
		Parent d = new Children();
		d.eat();
		d.growl();
		((Children) d).growl();
	}
	*/
	
	/*
	public static void main(String[] args) {
		int[] s = {3,4};
		 Integer b = new Integer(4);
		 test(s,b);
		 for (int x = 0; x < s.length; x++) {
			 System.out.println(s[x]);
		 }
		 
		 System.out.println(b);
				 
	}
	
	public static void test(int[] a, Integer y)
	 {
	 if (a.length > 1)
	 a[1] = a[1] * 2;
	 y = y * 2;
	 }
*/
	
	public static void main(String[] args) {
		Parent p = new Children();
		p.m2();
	}
	
}
