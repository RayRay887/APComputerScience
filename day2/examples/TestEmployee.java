package day2.examples;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Employee alex, linda, john;
		alex = new Employee();
		linda = new Employee();
		john = new Employee(); */
		
		Employee alex = new Employee();
		Employee linda = new Employee();
		Employee john = new Employee();
		
		alex.salary = 90000;
		alex.bonus = 2000;
		alex.calculateTotalPay();
		
		linda.salary = 20000;
		linda.bonus = 7000;
		linda.calculateTotalPay();
		
		john.salary =50000;
		john.bonus = 60000;
		john.calculateTotalPay();
		
	}

}
