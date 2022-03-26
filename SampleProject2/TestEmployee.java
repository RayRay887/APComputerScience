package SampleProject2;

import sampleProject.Department;
import sampleProject.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee alex = new Employee("Alex Rod",6);
		Employee linda = new Employee("Linda Berry",7);
		Employee john = new Employee("John Doe",3);
		
		Employee sara = new Employee("Sara Time",7);
		Employee james = new Employee("James Hugh",4);
		
		Department sales = new Department("XYZ Sales");
		Department IT = new Department("XYZ IT");
		
		sales.addEmployee(john);
		sales.addEmployee(linda);
		sales.addEmployee(alex);
		
		IT.addEmployee(james);
		IT.addEmployee(sara);
		
		sales.describe();
		IT.describe();
		
	}

}