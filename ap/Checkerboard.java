package ap;

public class Checkerboard {

	public static boolean[][] makeGrid(int row, int col){
		
		boolean [][] grid = new boolean[row][col];
		int count = 1;
		
		for (int x = 0; x < row; x++) {
			for (int y = 0; y < col; y++) {
				if (count % 2 == 1) {
					grid[x][y] = true;
					count++;
				}
			}
			
		}
		return grid;
	}
}
