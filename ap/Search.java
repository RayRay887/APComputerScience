package ap;

public class Search {

	public int searchForTitle(String[] titles, String target) {
		
		int foundIndex = -1;
		for (int i = 0; i < titles.length; i++) {
			if (titles[i].equals(target)) {
				
				foundIndex = 0;
			}
		}
		return foundIndex;
		
	}
	
}
