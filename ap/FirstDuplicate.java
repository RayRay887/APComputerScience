package ap;

import java.util.ArrayList;

public class FirstDuplicate {

	public static int fDuplicate(int array[]) {
		
		int earlier = 0;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for (int x = 0; x < array.length; x++) {
			for (int k = 1; k < array.length; k++) {
				if (array[x] == array[x+k]) {	
					arr.add(x+k);
				}
			}
		}
		
		if (arr.size() == 0) {
			System.out.println("no duplicates");
			return 0;
		}
		
		for (int x = 0; x < arr.size(); x++) {
			if (arr.get(x+1) < arr.get(x) ) {
				earlier = x;
			}
		}
		return array[earlier];
	}
	
}
