package ap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myArray = {67, 23, 12, 54, 35, 18};
		sort(myArray);
	}

	public static void sort(int[] arr) {
		int index = arr.length;
		while (index > 0) {
			for(int i = 0; i< arr.length-1; i++) {
				int temp = arr[i];
				int temp2 = arr[i+1];
				
				if (arr[i+1] < arr[i]) {
					arr[i+1] = temp;
					arr[i] = temp2;
				}
			}
			index--;
		}
		for (int element : arr) {
			System.out.println(element);
		}
	}
	
}
