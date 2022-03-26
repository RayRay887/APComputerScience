package ap;

public class QuestionOne {

	public int[] replace(int[] original) {
		
		int[] newArray = new int[original.length];
		
		for (int i = 0; i < original.length; i++) {
			if (original[i] > 750) {
				newArray[i] = 1000;
			} if (original[i] < 250) {
				newArray[i] = 0;
			} else {
				newArray[i] = original[i];
			}
		}
		
		return newArray;
	}
	
}
