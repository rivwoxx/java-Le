package fileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {

		File file = new File("file.txt");
		/*
		 * BufferedReader bufferedReader = null; FileReader fileReader = null;
		 */
		try (FileReader fileReader = new FileReader(file);
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {
			//to close resources doing this is better than the other adding the finally
			//it used to be normal to do it but now since java7 is not.
			String line = bufferedReader.readLine();

			while (line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			// e.printStackTrace();
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("Problem reading the file " + file.getName());
		} 
		//finally {
			// happens no matter what happens
			//try {
				//if (bufferedReader != null) {
					//bufferedReader.close();
			//	}
		//		if (fileReader != null) {
		//			fileReader.close();
		//		}

			//} catch (IOException e) {
//				e.printStackTrace();
				//System.out.println("Unable to close the file " + file.getName());
			//}
			/*
			 * catch (NullPointerException ex) {
			 * System.out.println("file was probably never opened" + ex); DONT USE THIS!!!!!
			 * Bad practice.
			 */
		//}

	}

}
