package ap.sub;

public class Raymond {

	static int year;
	int month;
	
	public static int getYear() {
		
		return year;
	}
	
	public int getMonth() {
		
		return month;
	}
	
	public static void setYear(int newYear) {
		year = newYear;
		
	}
	
	public void setMonth(int newMonth) {
		
	}
	
	public long fractorial(long n) {
		 if (n <= 1 && n >= 0) {
			 return 1;
		 }
		 if (n < 0) {
			 return -1;
		 }
		 else {
			  return n * fractorial(n-1); 
		 } 
	}
	
	public long fractorialBetter(long n) {
		 if (n <= 1 && n >= 0) {
			 return 1;
		 }
		 if (n < 0) {
			 return -1;
		 }
		 else {
			 long preVal=1;
			 long result=0;
			  for (long i = 2; i <= n; i++) {
				  result = i*preVal;
				  preVal = result;
			  }
			  return result;
		 } 
	}
	
}
