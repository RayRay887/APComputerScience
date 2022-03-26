package AbstractExamples;

public abstract class Container {

	public void calculateVolume(int length, int height) {
		double volume = calculateAreaOfBase(length) * height;
		System.out.println(volume);
		
	}
	
	public abstract double calculateAreaOfBase(int length); 
}
