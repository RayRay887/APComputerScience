package ap;

public class Quesrtionfour {

	public int[] price(double[] original) {
		
		int [] sell = new int[original.length];
		
		for (int x = 0; x < original.length; x++) {
			
			if (original[x] > 70) {
				
				sell[x] = 1;
				
			} else {
				sell[x] = 0;
			}
		}
		return sell;
	}
	
}
