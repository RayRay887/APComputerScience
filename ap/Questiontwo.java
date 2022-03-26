package ap;

import java.util.ArrayList;

public class Questiontwo {

	public boolean isIncreasing(ArrayList<Integer> original) {
		
		for (int i = 1; i < original.size(); i++) {
			if (original.get(i) <= original.get(i-1)) {
				return false;
			}
		}
		return true;
	}
	
}
