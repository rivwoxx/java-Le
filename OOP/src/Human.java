
public class Human {
	// attributes
	String name;
	int age;
	int heightInInches;
	String eyeColour;

	// constructor
	public Human(String name, int age, int heightInInches, String eyeColour) {
		super();
		this.name = name;
		this.age = age;
		this.heightInInches = heightInInches;
		this.eyeColour = eyeColour;
	}
	/*
	 * public Human() { //it comes as default in all clases it is not actually
	 * necessary to write it =\
	 * 
	 * 
	 * age = 5; eyeColour = "black"; heightInInches = 77; name = "Tom Stallard";
	 * 
	 * }
	 */

	
	// methods
	public void speak() {
		System.out.println("Hello my name is " + name);
		System.out.println("my age is " + age);
		System.out.println("I am " + age + " inches tall");
		System.out.println("My eye colour is " + eyeColour);
	}

	public void eat() {
		System.out.println("eating...");
	}

	public void walk() {
		System.out.println("walking...");
	}

	public void work() {
		System.out.println("working...");
	}
}
