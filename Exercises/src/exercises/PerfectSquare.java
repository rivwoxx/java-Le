//Generate a program to indicate if a given number is a perfect sq

package exercises;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Write a number: ");
		int givenNumb = input.nextInt();
		
		if (givenNumb % 2 == 0) {
			System.out.println(givenNumb + " number is a Perfect Squared");
		}else {
			System.out.println(givenNumb + " number is NOT a Perfect Squared");
		}
		
		input.close();

	}

}
