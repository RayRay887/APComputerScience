package sampleProject;

public class Employee {

	private String name;
	private int grade;
	
	public int getGrade() {
		return grade;
	}

	public Employee(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public String getEmployeeInfo() {
		return name + "(" + grade + ")";
	}
	
}
