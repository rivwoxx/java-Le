package courseproject;

public class Arrays {

	public static void main(String[] args) {
		int [] values = new int[100];  //fixed size of 100 0-99
		values[2] = 1000;
		values[99] = 1234;
		
		String [] something = {"Augustus", "Riverus"};
		
		String [] pepe = new String[100];
		pepe[0] ="Something";
		pepe[1] ="else";
		
		double[] doubl = new double[12];
		doubl[1] = 1000;
		doubl[2] = 33.45;
		
		System.out.println(values[99]);
		System.out.println(something[1]);
		System.out.println(doubl[2]);
		System.out.println(pepe[1]);
		
		pepe = new String [10];		//a new array called pepe
		System.out.println(pepe[0]);
	}

}
