package day3.Inheritence;

public class NewBox extends Box{

	//will not aquire private data and methods
	
	public void calculateVolume(int length, int width, int height) {
		System.out.println(length*width*height);
	}
	
	//Overriding: when the subclass has the same named method as the superclass
	
	public void calculateArea(int length, int width) {
		System.out.println(length/width);
	}
	
	
}
