import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {
	public static void main(String[] args) {

		String url = "jdbc:mysql://databaseurl:3306/employees_databas";
		try {
			// Establish Connection Object
			Connection conn = DriverManager.getConnection(url, "rivwox", "rivwox12");

			// Create a statement object to send to the database
			Statement statement = conn.createStatement();

			// Execute the statement object
			ResultSet resultSet = statement.executeQuery("SELECT * FROM employees_tbl");
			// resulstset is gonna contain the data from the DBs

			// Inserting data
			//if you'd like to know how many rows where afected you can add a variable so the
			//.executeupdate will return you the number of rows affected 
			
			//statement.executeUpdate("INSERT INTO employees_tbl(id, name,dept,salary) VALUES (900,'Augustus','Sales',5500)");
			
			
			//Deleting data
			//statement.executeUpdate("DELETE FROM employees_tbl WHERE id =900");
			
			//Updating data
			//statement.executeUpdate("UPDATE employees_tbl SET salary = 5900 WHERE id=700");
			
			// Process the result
			int salaryTotal = 0;
			while (resultSet.next()) {// going to go record by record and on the next line will show the info
				System.out.println(resultSet.getString("name"));
				System.out.println(resultSet.getString("salary"));
				salaryTotal = salaryTotal + resultSet.getInt("salary");
				// in order to do the sum example we are doing we must get the data in
				// corresponding data type in this casa int
			}

			System.out.println(salaryTotal);

		} catch (SQLException e) {
			// System.out.println("Failed Connection!");
			e.printStackTrace();
		}
	}
}
