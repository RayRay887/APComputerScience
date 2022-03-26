package ap;

public class Questionthree {

	public int findCount(String[][] original, String target) {
		
		int count = 0;
		
		for (int x = 0; x < original.length; x++) {
			for (int y = 0; y < original[0].length; y ++ ) {
				if (original[x][y].indexOf(target) > -1) {
					
					System.out.println(x + ", " + y);
					count++;
				}
			}
		}
		return count;
	}
	
	
}
