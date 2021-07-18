package courseproject;

public class ControlFlow {

	public static void main(String[] args) {
		
		boolean hungry = false ;
		
		if(hungry) {
			System.out.println("I'm Starving!");
		}else {
			System.out.println("I'm not hungry!");
		}
		
		int hungerRating = 5;
		
		if (hungerRating < 6) {
			System.out.println("Not Hungry");
		}else {
			System.out.println("I'm Starving!");
		}
		
		int favoriteTemp = 75;
		int currentTemp = 40;
		String opinion;
		
		if(currentTemp < favoriteTemp - 30) {
			opinion = "It's cold apparently";
		}else if (currentTemp < favoriteTemp - 20) {
			opinion = "It's kinda cold out...";
		}else if (currentTemp < favoriteTemp + 20) {
			opinion = "It's hot out";
		}else {
			opinion = "It's a beautiful day!";
		}
		
		System.out.println(opinion);
		
		int month = 6;
		String monthString;
		
		switch(month) {
		case 1: monthString = "January";
			break;
		case 2: monthString = "February";
			break;
		case 3: monthString = "March";
			break;
		case 4: monthString = "April";
			break;
		case 5: monthString = "May";
			break;
		case 6: monthString = "June";
			break;
		default: monthString = "Meh";
			break;
		}
		
		System.out.println(monthString);
	}

}
	