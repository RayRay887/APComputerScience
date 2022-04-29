package ap;

public class SelectionSort {

	public static int[] sort(int[] arr) {
		int index = arr.length -1;
		while (index > 0) {
			for(int i = 0; i< arr.length; i++) {
				int temp = arr[i];
				int temp2 = arr[i+1];
				
				if (arr[i+1] < arr[i]) {
					arr[i+1] = temp;
					arr[i] = temp2;
				}
			}
			index--;
		}
		return arr;
	}
	
}
