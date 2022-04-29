package ap;

public class SelectionSort2 {

	
	public static void sort2(int[] arr) {
		int count = 0;
		int lowest = arr[0];
		int temp = 0;		
		for (int y = 0; y < arr.length -1; y ++) {
			for (int x = count; x < arr.length-1; x++) {
				if (arr[x + count] > arr[x + count +1]) {
					lowest = arr[x + count +1];
					temp = x + count +1;
				}
			
			arr[temp] = arr[count];
			arr[count] = lowest;
			
			}
		}
		
		for (int element : arr) {
			System.out.println(arr[element]);
		}
	}
		
}
