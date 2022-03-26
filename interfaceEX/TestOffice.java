package interfaceEX;

public class TestOffice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Office obj = new Word();
		obj.Open();
		obj.Save();
		
		obj = new Excel();
		obj.Open();
		obj.Save();
		
	}

}
