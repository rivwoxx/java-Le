
/*Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreat
Sam                2000                68D- WallsStreat
John                1999                26B- WallsStreat
*/

package exercises;

public class Employee {

	String name;
	int joYear;
	double salary;
	String addr;

	public Employee(String name, int joYear, double salary, String addr) {
		this.name = name;
		this.joYear = joYear;
		this.salary = salary;
		this.addr = addr;
	}

	public void description() {
		/*
		 * System.out.println("Employee name: " + name);
		 * System.out.println("Year or Joining: " + joYear);
		 * System.out.println("Salary: "+ salary); System.out.println("Address: "+
		 * addr);
		 */

		// to match with the exercise
		System.out.println(name + "  " + joYear + "  " + salary + "  " + addr);
	}

	public static void main(String[] args) {
		Employee robert = new Employee("Robert", 1994, 43000.00, "64C - Wall Street");
		Employee sam = new Employee("Sam", 2000, 43000.00, "68D - Wall Street");
		Employee john = new Employee("John", 1999, 43000.00, "26B - Wall Street");
		Employee marc = new Employee("Marc", 2006, 4343.55, "24A - Wall Street");

		Employee[] employs = { robert, sam, john, marc };

		System.out.println("Name " + " Year of Join " + " Salary " + " Address ");

		for (int i = 0; i < employs.length; i++) {
			employs[i].description();
		}

	}

}
