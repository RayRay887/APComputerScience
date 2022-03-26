package AbstractExamples;

public class CircleContainer extends Container{
	
	public double calculateAreaOfBase(int length) {
		double area = (length/2)*(length/2)*Math.PI;
		System.out.println(area);
		return area;
	}

}
