package day2.oop.overloading;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee alex = new Employee();
		
		alex.setSalary(1000000);
		alex.setBonus(2000);
		alex.calculateTotalPay();
		
		
		System.out.println(alex.getSalary());
	}

}
