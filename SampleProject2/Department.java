package SampleProject2;

import java.util.List;
import java.util.ArrayList;

public class Department {

	private String depName;
	private double budget;
	
	//private Employee[] employee = new Employee[5];
	
	private List<Employee> employee = new ArrayList<>();

	private int counter = 0;
	
	public Department(String depName) {
		this.depName = depName;
		this.budget = 50000;
	}
	
	public void addEmployee(Employee obj) {
		employee.add(obj);
		counter++;
		
		if (obj.getGrade() >= 5) {
			this.budget += 150000;
		} else {
			this.budget += 50000;
		}
	}
	
	public void describe() {
		String temp = "Departement: " + this.depName + "Budget: " + this.budget;
		for(Employee x: employee) {
			//if (x != null) {
				temp += " " + x + "";
			//}
			
		}
		System.out.println(temp);
	}
	
	
	
}