package courseproject;

import java.util.HashMap;

public class Hashmaps {

	public static void main(String[] args) {
		
		HashMap<String, Integer> happy = new HashMap<String,Integer>();
		happy.put("a",10);
		happy.put("b", 3);
		happy.put("c", 88);
		
		System.out.println(happy.get("c"));
		
		HashMap<String,String> fun = new HashMap<String,String>();
		fun.put("Bob", "suodahiroe");
		fun.put("Augustus", "443ggrera");
		fun.put("Rivwox","43fwe");
		
		System.out.println(fun);
		System.out.println(fun.get("Augustus"));
		
		fun.remove("Bob");
		System.out.println(fun);
		
//		System.out.println(fun.containsValue("Rivwox"));
		System.out.println(fun.containsKey("Rivwox"));
		System.out.println(fun.replace("Rivwox", "f3g5ghsreg54gregserg"));
		System.out.println(fun);
	}

}
