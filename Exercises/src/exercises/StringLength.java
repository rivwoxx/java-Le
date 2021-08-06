//  Write a Java program to get the length of a given string
package exercises;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write something please: ");
		String str = sc.nextLine();
		
		System.out.println("The length of the string you wrote is " + str.length());

	}

}
