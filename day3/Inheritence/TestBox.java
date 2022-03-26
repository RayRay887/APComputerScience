package day3.Inheritence;

public class TestBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box fedEx = new Box();
		
		fedEx.calculateArea(3, 4);
		
		NewBox ups = new NewBox();
		ups.calculateArea(5, 3);
		ups.calculateVolume(5, 3, 3);
		
	}

}
