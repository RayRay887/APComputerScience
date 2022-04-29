package ap;

public class BinarySearch {

	public static boolean binary(int target, int[] arr) {
		int low = 0;
		int high = arr.length;
		
		while (high >= low) {
			int middle = (high - low)/2;
			if (arr[middle] == target) {
				return true;
			}
			if (arr[middle] < target) {
				low = middle +1;
			}
			if (arr[middle] > target) {
				high = middle -1;
			}
			
		}
		return false;
	}
	
}
