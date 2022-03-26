package errorhandling;

public class ExampleException {

	public static void main(String[] args) {
		
		int d[] = new int[3];
		int a = 10;
		int b = 0;
		int c = 0;
		
		try {
		
		c = a/b;
		d[4] = 10;
		
		}catch(Exception obj) {
			
			System.out.println("error occured"+ obj);
			//obj will print the type of error
			
			obj.printStackTrace();
			//Tells you where the error occurred
			
		}
		
		//We can catch specific errors too
	
		try {
			d[3] = 10;
			c = a/b;
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println(e + "HIHIHI");
		}catch(Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("This always runs");
		}
		
		//it will only go to the last catch statement if the error is not part of the first catch
		
		System.out.println(c);
		
		// if there is an error then the code will still keep running but c != a/b, c = 0 its original value
		//not possible to / by 0
		
	}

}
