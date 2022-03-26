package ap;

import java.lang.Math;

public class Height {

	private double feet;
	private double inches;
	
	public Height(double justInches) {
		feet = justInches;
	}
	
	public Height(double inches, double feet) {
		this.feet = feet;
		this.inches = inches;
		
		simplify();
	}
	
	public void simplify() {
		if (this.inches > 12) {
			this.feet += Math.floor(this.inches / 12);
			this.inches = this.inches % 12;
		}
	}
	
	public void add(int inches) {
		this.inches += inches;
		simplify();
	}
	
	
	public void add(Height ht) {
		this.feet += ht.getFeet();
		this.inches += ht.getInches();
		
		simplify();
	}
	
	public double getInches() {
		return this.inches;
	}
	
	public double getFeet() {
		return this.feet;
	}
}	
	
	
	
	
}
