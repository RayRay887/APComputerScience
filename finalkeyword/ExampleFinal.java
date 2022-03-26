package finalkeyword;

public final class ExampleFinal {

	//final keyword can be applied to data, methods, classes
	//final data is a constant. cannot be changed
	//final methods cannot be overridden
	//final classes cannot be sub classed
	
	final double pi = 3.14;
	
	public final void methodA() {
		//pi = 4.0 not possible
		System.out.println(pi);
	}
	
}
