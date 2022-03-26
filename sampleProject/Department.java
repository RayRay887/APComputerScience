package sampleProject;

public class Department {

	private String depName;
	private double budget;
	
	//private Employee[] employee = new Employee[5];
	
	private Employee[] employee = new Employee[5];

	
	private int counter = 0;
	
	public Department(String depName) {
		this.depName = depName;
		this.budget = 50000;
	}
	
	public void addEmployee(Employee obj) {
		employee[counter] = obj;
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
			if (x != null) {
				temp += " " + x.getEmployeeInfo()+ "";
			}
			
		}
		System.out.println(temp);
	}
	
	
	
}
