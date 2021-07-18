package PracticeLoops;

public class forLoop {
	public static void main(String args[]) {
		for (int i = 0; i < 10; i++) {
			System.out.println("something " + i);
		}

		String name = "asdfeghjkliuyitredsbfteyrnyumiyiynybvcfvrgtbhnybhvrgcfvrgtbhnybjthtvrgr";

		for (int i = 0; i < name.length(); i++) {
			System.out.println("char: " + name.charAt(i));
			if (name.charAt(i) == 'e') {
				break;
			}
		}

		System.out.println(" ");

		String meme = "Perestroika";
		for (int i = meme.length() - 1; i >= 0; i--) {
			System.out.println("char: " + meme.charAt(i));

		}
		
		for (int i=0; i<100; i++) {
			if (i%2==0) {
				System.out.println(i);
			}
		}
		//or
		int count =0;
		for(int i=0;i<100; i+=2) {
			for(int j=0;j<200;j++) {
				if(count > 5000) break;
				System.out.println(count + " something " + i + "---" + j);
				count++;
			}
			
		}

	}
}
