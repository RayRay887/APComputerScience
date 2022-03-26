package StaticEx;

public class ExampleStatic {

	static int staticVariable;
	
	int nonStaticVariable;
	
	static public void staticMethod() {
	
	System.out.println(staticVariable);
	staticVariable++;
	}
	
	public void nonStaticMethod() {
		System.out.println(nonStaticVariable);
		nonStaticVariable++;
	}
	
	static {
		System.out.println("Static block of code");
	}
	
	ExampleStatic() {
		System.out.println("Constructor");
	}
	
}
