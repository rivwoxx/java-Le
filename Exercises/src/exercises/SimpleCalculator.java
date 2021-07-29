package exercises;

import java.util.Scanner;

public class SimpleCalculator {

	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int substract(int a, int b) {
		int res = a - b;
		return res;
	}

	public static int multiply(int a, int b) {
		int mul = a * b;
		return mul;
	}

	public static int divide(int a, int b) {
		int div = a / b;
		return div;
	}

	public static int modulo(int a, int b) {
		int res = a % b;
		return res;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Give two numbers for addtion: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println(add(num1, num2));
	}
}