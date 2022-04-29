package ap;

public class Fibonachi {
	
	public static int calculate(int n) {
		
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return calculate(n-1) + calculate(n-2);
		}
		
	}
	
	public int fibonacci(int n) {
		  if (n == 0) {
		    return 0;
		  }
		  
		  if (n==1) {
		    return 1;
		  }
		  
		  int fn_2 = 0;
		  int fn_1 = 1;
		  int result = 0;
		  
		  for (int x = 2; x <= n; x++) {
		    int fn = fn_1 + fn_2;
		    result = fn;
		    fn_2 = fn_1;
		    fn_1 = fn;
		  }
		  return result;
		  
		}
	}
