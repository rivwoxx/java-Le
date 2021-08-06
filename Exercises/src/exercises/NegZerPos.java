//Write a Java program that reads an integer and check whether it is negative, zero, or positive

package exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NegZerPos {

	public static void main(String[] args) {
		
		//while(true) {
			try {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Write a number: "); 
				double number = sc.nextDouble();
				
				if (number < 0) {
					System.out.println(number + " is NEGATIVE");
				}else if(number == 0) {
					System.out.println(number + " is ZERO");
				}else {
					System.out.println(number + " is POSITIVE");
				}
			}catch(InputMismatchException e) {
				System.err.println("You had to write a number you fucking moron!");
			}
		//}
		
		

	}

}
