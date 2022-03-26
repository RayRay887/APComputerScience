package day2.oop.overloading;

public class Employee {

	private double salary;
	private double bonus;
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void setSalary(double salary) {
		if (salary >=4000 && salary <= 200000) {
			this.salary = salary;
		} else {
			this.salary = 0;
			System.out.println("Please check salary"); 
		}
	}
	
	void calculateTotalPay() {
		double totalPay = salary + bonus;
		System.out.println("Total pay = " + totalPay);
	}
	
	public double getSalary() {
		return salary;
	}
	
}
