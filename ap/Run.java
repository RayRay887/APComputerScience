package ap;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] board = {{0,0,0,0,0,0,0},
				{0,2,0,0,2,1,0},
				{0,0,2,0,1,2,0},
				{1,0,1,2,1,1,0},
				{2,2,1,2,2,2,1},
				{1,1,2,1,2,1,1} };
		
		win(board);
		
	}

private static int count = 0;
	
	public static boolean win(int board[][]) {
		
		for (int x = 0; x < board.length; x++ ) {
			
			for(int z = 4; z < board.length - count; z++) {
				
				for (int y = count; y < board[0].length-z; y++) {
					
					if (board[x][y] != 0 && board[x][y] == board[x][y-1] && board[x][y-1] == board[x][y-2] && board[x][y-2] == board[x][y-3] ) {
						return true;
					}
					
				}
				count++;
			}
		}
		count = 0;
		for (int y2 = 0; y2 < board[0].length; y2++) {
			for (int z2 = 4; z2 < board.length - count; z2++) {
				for (int x2 = 0; x2 < board.length - z2; x2++) {
					if (board[x2][y2] != 0 && board[x2][y2] == board[x2-1][y2] && board[x2-1][y2] == board[x2-2][y2] && board[x2-2][y2] == board[x2-3][y2] ) {
						return true;
					}
				}
				count++;
			}
		
		}
		
		for (int r = 0; r <= board.length - 4; r++)
		 {
			for (int c = 0; c <= board[0].length - 4; c++)
			{
				if (board[r][c] != 0 && 
					board[r][c] == board[r+1][c+1] && 
					board[r+1][c+1] == board[r+2][c+2] && 
					board[r+2][c+2] == board[r+3][c+3])
					return true;
				 }
		 }
		
		for (int r = 3; r < board.length; r++)
		 {
			for (int c = 0; c <= board[0].length - 4; c++)
			{
				if (board[r][c] != 0 && 
				board[r][c] == board[r-1][c+1] && 
				board[r-1][c+1] == board[r-2][c+2] && 
				board[r-2][c+2] == board[r-3][c+3])
					return true;
			 }
		 }

		return false;
	}
	
}
