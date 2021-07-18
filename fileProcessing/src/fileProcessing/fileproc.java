package fileProcessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileproc {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter some text: ");
		String enteredText = input.nextLine();
		System.out.println(enteredText);
		input.close();

//		File file = new File("filex.txt");
		// Scanner inputFile = new Scanner(file);
		// while(inputFile.hasNextLine()) {
		// String line = inputFile.nextLine();
		// System.out.println(line);
		// }
		// inputFile.close();

		try {
			File file = new File("file.txt");
			Scanner inputFile;
			inputFile = new Scanner(file);

			while (inputFile.hasNextLine()) {
				String line = inputFile.nextLine();
				System.out.println(line);
			}
			inputFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		//	e.printStackTrace();
			
		}
	
	try {
		System.out.println(subtract2FromLargerNumber(2));;
	} catch (Exception e) {
		e.printStackTrace();
	}
		
	}

	public static int subtract2FromLargerNumber(int number) throws Exception{
		if(number <= 2) {
			throw new FooRuntimeException("The number passed was smaller that 2");
		}
		return number -2;
	}
	
	//defining my own exception
	
	public static class FooRuntimeException extends Exception{ //in thid case both the past method and this class are defined as sttic so I dont have to put themon another file
		public FooRuntimeException(String message) {
			super(message);
		}
	}
}
