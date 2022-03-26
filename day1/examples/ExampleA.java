package day1.examples;

public class ExampleA {

	public static void main(String[] args) {

		double salary = 60000;
		
		if(salary >= 0 && salary <= 14000) {
			System.out.println("Salary After Tax is " + salary*0.9);
		}else if(salary > 14000 && salary <= 40000) {
			System.out.println("Salary After Tax is " + salary*0.8);
		}else if(salary > 40000) {
			System.out.println("Salary After Tax is " + salary*0.7);
		}
	}

}
