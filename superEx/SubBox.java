package superEx;

public class SubBox extends Box{

	public void calculateVolume(int length, int width, int height) {
		double volume  = super.calculateArea(length, width) * height;
		System.out.println("Volume = " + volume);
	}
	
}
