package StaticEx;

public class TestStatic {

	public static void main(String[] args) {
		
		ExampleStatic obj = new ExampleStatic();
		
		//Static block of code will always fire and fire even before the constructor
		//static will only be fired once 
		// but contructor will be fired twice
		
		obj.staticMethod();
		obj.staticMethod();
		// or use
		ExampleStatic.staticMethod();
		
		//cannot call non static like this: ExampleStatic.nonStaticMethod
		
		obj.nonStaticMethod();
		obj.nonStaticMethod();
		
		//////////////////////////
		
		ExampleStatic obj2 = new ExampleStatic();
		
		obj2.staticMethod();
		obj2.staticMethod();
		
		//obj 2 adds on to the vaules obj resulted with
		//or in other words continues to use the same data
		//meaning it doesnt matter the variable the static method always adds on to the lastest result
	
		obj2.nonStaticMethod();
		obj2.nonStaticMethod();
		
		//whereas nonstaticmethod does not follow the latest result but makes a fresh copy instead
	
		//Note: the main method has been declared as static because someone can make objects of the main method. For example they can make obj and obj2 they want both to avaoid calling main at the same time
		
	}

}
