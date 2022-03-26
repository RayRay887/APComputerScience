package ap;

public class QuestionFive {

	public static int[] even(int arraySize, int range) {
		
		int[] result = new int[arraySize];
		
		int x;
		
		for (int i = 0; i < arraySize; i++) {
			x = (int)(Math.random()* range);
			while (x % 2 == 1) {
				x = (int)(Math.random()* range);
		}
		
		result[i] = x; 
		}
		return result;
	} 
	
}
