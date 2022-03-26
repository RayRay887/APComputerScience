package ap;
import java.util.ArrayList;
public class QuestioSix {

	public boolean rateIsIncreasing(ArrayList<Double> original) {
		
		for (int x = 2; x < original.size(); x++) {
			if (original.get(x) - original.get(x-1) <= original.get(x-1) - original.get(x-2)) {
				return false;
			}
		}
		return true;
	}
	
}
