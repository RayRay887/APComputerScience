package day1.examples;

public class StringExample {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub

		java.lang.String x = "James Dean";
		
		System.out.println("Hello " + x);
		
		System.out.println(x.toUpperCase());
		
		System.out.println(x.substring(2));
		
		System.out.println(x.substring(2,5));
		
		System.out.println(x.charAt(3));
		
		java.lang.String age = "37";
		java.lang.String salary = "78965.83";
		
		//Wrapper Classes
		
		int a = Integer.parseInt(age)/2;
		System.out.println(a);
		
		double s = Double.parseDouble(salary)*.15;
		System.out.println(s);
		
	}

}
