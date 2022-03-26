package ap;

public class GridBuilder {
	 public static void main(String[] args) 
	 {
		 boolean[][] grid = makeGrid(3, 4); //change (3,4) to test
		 for (int y = 0; y < grid.length; y++) 
		 {
			 for (int x = 0; x < grid[0].length; x++) 
			 {
				 System.out.print(grid[y][x] + "\t");
			 }
			 System.out.println();
		 }
	 } 
}
