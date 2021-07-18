package collsGens;

import java.util.ArrayList;
import java.util.LinkedList;

public class App {
	public static void main(String[] args) {
		ArrayList words = new ArrayList();
		words.add("hello");
		words.add("there");
		//words.remove("hello");
		words.add(10);
		words.add(9.32);
		words.add('J');
		
		//the return from .get() is an object
		//so we cast them so we can use them as String in this example
		String item1 = (String)words.get(0);
		String item2 = (String)words.get(1);
		Object item3 = words.get(3);
		Object item4 = words.get(2);
		/*
		 * Integer item5 = (int)words.get(3); Integer item6 = (int)words.get(2);
		 */
		//or you can specify the data type using ArrayList<String> but the MF decided to explained later because yeah, write everything.
		//meh!
		//System.out.println(item4 + item3); //+is undefined for objects so we have to cast those object into their respective data type/
		
		ArrayList<String> other = new ArrayList<String>();
		other.add("something");
		//other.add(23); //you cannot add ints since it a String only ArrrayList
		other.add("something else");
		
		
		//LinkedList<int> numbers = new LinkedList<int>();
		//you cannot use primitive data types for linked list
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		numbers.add(32);
		numbers.add(44);
		numbers.add(55);
		
		for(int i : numbers) {
			System.out.println(i);
		}
		
	}
}
