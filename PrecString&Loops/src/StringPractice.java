
public class StringPractice {

	public static void main(String[] args) {
		
		String a = "Hello  $#^#^#%#$^$^$#";
		
		System.out.println(a);
		
		String str = "ABCDEGF"; //String with seven characters
		
		System.out.println(str.length());
		
		String extractedString = str.substring(3);
		//deleted index 0 1 and 2, so it should show the index from index 3.
		System.out.println(extractedString); //show the rest of the string from the substracted index		
		
		String extractedex2 = str.substring(2,5);
		//delete index 0 and 1 and show from range 2 to index 5, and substract the rest
		System.out.println(extractedex2);
		
		String b = "Hello";
		String c = "There";
		
		if(b == "hello") {
			//Dont do this
		}
		
		if(b.equals("hello")) {
			//do this
		}
		
		if(c.equalsIgnoreCase("thErE")) {	//it is case sensitive so we should use ignorecase for it to not matter
			System.out.println("something");
		}
		
		//What character lays in a specific index
		
		System.out.println(b.charAt(3));
	
		String srt2 = "Hello There General Kenobi There General";
		int d = srt2.indexOf("There");
		int e = srt2.indexOf("There",7); //I start the search from index n
		System.out.println(d);
		System.out.println(e);
		
		int f = srt2.lastIndexOf("General"); //search from right to left
		int g = srt2.indexOf("General");
		System.out.println(f);
		System.out.println(g);
	}

}
