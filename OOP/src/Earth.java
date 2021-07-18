
public class Earth {
	public static void main(String args[]) { // entry point for all java apps
		/*
		 * Human tom; tom = new Human(); // tom is an object type human tom.age = 5;
		 * tom.eyeColour = "black"; tom.heightInInches = 77; tom.name = "Tom Stallard";
		 * tom.speak();
		 * 
		 * Human joey; //instance variable joey = new Human(); joey.age = 14;
		 * joey.eyeColour = "brown"; joey.heightInInches = 76; joey.name =
		 * "Joey Joeylino"; joey.speak(); joey.walk();
		 */
		Human human1 = new Human("Tom Stallard",5,77,"Black");
		human1.speak();
	}
}
