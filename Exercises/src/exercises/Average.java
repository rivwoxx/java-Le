// Print the average of three numbers entered by user by creating a 
//class named 'Average' having a method to calculate and print the average.

package exercises;

import java.util.Scanner;

public class Average {
	
	public static double average(double a, double b, double c) {
		
		double avg = (a+b+c)/3;
		
		return avg;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give me three numbers: ");
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		scan.close();
		
		System.out.println(average(a,b,c));
		
		
		

	}

}
