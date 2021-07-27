/*Write a project which tell you whether a given year
is a Leap year,
A year is leap year if they multiply by 4 
but not those multiplied by 100
notheless those multiply by 400 are, 
ex 2000 is leap but 1800 is not.*/

package exercises;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Write a year.");
		int givenYear = input.nextInt();
		
		if((givenYear % 100 != 0 || givenYear % 400 == 0 ) && givenYear % 4 == 0) {
			System.out.println(givenYear + " is a LeapYear");
		}else {
			System.out.println(givenYear + " is NOT a LeapYear");
		}
		
		input.close();
	}

}
