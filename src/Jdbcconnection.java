import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbcconnection {
	public static void main(String[] args) {
            // Perform on CRUD Operation
		try {
			Class.forName("oracle:jdbc:driver:OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Raghu");
			Statement smt=con.createStatement();
			smt.executeUpdate("create table emp(eno number,ename varchar2(20),ecity varchar2(15),esal varchar2(20)");
			System.out.println("Table created Succesfully");
			con.close();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}

}
