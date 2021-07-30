// Write a Java program to find the maximum and minimum value of an array.

package exercises;

public class MaxArray {

	public static void main(String[] args) {
		int[] numbers = { 32, 4, 9, 886, 7, 8,2, 9, 10, 32, 3, 1902, 123, 32, 3, 5, 4, 6, 4, 5, 6, 7 };

		System.out.println(MaxNumber(numbers));
		System.out.println(MinNumber(numbers));
	}

	public static int MaxNumber(int[] arr) {
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int MinNumber(int[] arr) {

		int min = MaxNumber(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}
		return min;
	}

}
