package exercises;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayDate {

	
	public static void main(String[] args) {
		DisplayDate.DispDate();

	}
	
	private static void DispDate() {
		LocalDateTime date = LocalDateTime.now();
		
		
		DateTimeFormatter dateFormatted = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
		String formattedDate = dateFormatted.format(date);
		
		System.out.println("Today is: " + formattedDate);		
		//return(formattedDate);
				
		 
	}

}
