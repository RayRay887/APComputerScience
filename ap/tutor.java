package ap;

import java.util.Date;

public class tutor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date x =  new Date();
		Date y = new Date();
		x.setTime(1000);
		System.out.println(x);
		incrimental(x);  
		System.out.println(x);
		
		
		
	}

	public static void incrimental(Date x) {
		x.setTime(1000);
		System.out.println(x);
	}
	
}
