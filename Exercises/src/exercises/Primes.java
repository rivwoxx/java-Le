package exercises;

public class Primes {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i <= 1000; i++) {
			if (isPrime(i) == false) {
				continue;
			}
			System.out.println(i);
			count++;
		}
		System.out.println(count);	}

	public static boolean isPrime(int number) {
//		if (number == 2) {
//			return true;
//		} else 
		if (number < 2) {
	return false;
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}