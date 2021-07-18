package PracticeLoops;

public class whileLoop {

	public static void main(String[] args) {
		// while loop

		/*
		 * Infinite loop while(true) { System.out.println("something"); }
		 */

		int count = 0;
		while (count <= 100) {
			if (count == 50) {
				System.out.println(count + " something");
				break;
			} else {

				System.out.println(count + " hey!");
			}

			count += 1;
		}
		
	}

}
