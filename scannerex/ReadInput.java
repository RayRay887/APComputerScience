package scannerex;

import java.util.Scanner;

public class ReadInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("input name");
		String name = input.next();
		
		System.out.println("Hi! " + name);
		
		
		try {
		int a = input.nextInt();
		//int a = Integer.parseInt(aint);
		System.out.println(a);
		} catch(Exception e) {
			System.out.println("Wrong Values");
		}
		
		System.out.println("Input many numbers");
		int total  = 0;
		while(input.hasNextInt()) {
			total = total + input.nextInt();
		}
		System.out.println(total);
		
		String temp= "";
		while(input.hasNext()) {
			temp = input.next();
			if(temp.equals("exit")) {
				break;
			}
		}
		
		System.out.println("out of loop");
		
	}

}
