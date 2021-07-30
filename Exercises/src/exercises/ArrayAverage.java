//Write a Java program to calculate the average value of array elements.


package exercises;

public class ArrayAverage {

	public static void main(String[] args) {
		double[] arr = {10,23,43,23,54,49,434,54,34,34,54,65};
		double arrSum = 0;
		double arrAverage = 0;
		for(int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
			arrSum = arrSum + arr[i];
			//System.out.println(arrSum);
		}
		arrAverage = arrSum / arr.length;
		System.out.println(arrAverage);
	}

}
