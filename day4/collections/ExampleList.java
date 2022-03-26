package day4.collections;

import java.util.ArrayList;
import java.util.List;

public class ExampleList {

	public static void main(String[] args) {
		
		String array[] = new String[10];

		array[0] = "zero";
		array[9] = "nine";
		
		ArrayList list = new ArrayList();
		
		//or 
		
		//List list = new ArrayList();
		
		
		//Called non generic list
		list.add("one");
		list.add(2);
		list.add(true);
		
		//All classes extend the Object Class
		for(Object temp : list) {
			System.out.println(temp);
		}
		
		//can only add a specific data type
		
		List<String> gList = new ArrayList<String>();
		gList.add("hi");
		gList.add("awfawfa");
		gList.add("nye");
		gList.add("hello");
		
		gList.remove(2);
		gList.remove("four");
		gList.add(0,"Start");
		
	}

}
