package ap;

public class Modify2D {

	public int[][] modify(int[][] arr) {
		
		int[][] newArray = new int[arr.lenght][arr[0].length];
		
		for (int y = 0; y < arr.length; y++) {
			for (int x = 0; x < arr[0].length; x++) {
				if (y % 2 == 0) {
					newArray[x][y] = arr[x][y];
				}
				else {
					newArray[x][y] = arr[x-1][y];
				}
			}
			
		}

	}
}
