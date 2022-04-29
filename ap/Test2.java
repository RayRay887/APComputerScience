package ap;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = {67, 23, 12, 54, 35, 18};
		sort2(myArray);
	}

	
	public static void sort2(int[] arr) {
		int count = 0;
		int lowest = Integer. MAX_VALUE;
		int temp = 0;
		int temp2 = 0;
		for (int y = 0; y < arr.length-1; y ++) {
			temp = y;
			for (int x = count; x < arr.length-1; x++) {
				
				if (arr[temp] > arr[x+1]) {
					temp = x+1;
					lowest = arr[x+1];
				}
				
			}
			temp2 = arr[count]; 
			arr[count] = lowest;
			arr[temp] = temp2;
			count++;
		}
		
		for (int element : arr) {
			System.out.println(element);
		}
	}
	
}
