package demo;


import java.sql.SQLException;
import java.sql.Statement;



public class StudentDAOImpl {

	public void addStudent(Student s1) throws SQLException {
		// TODO Auto-generated method stub
		
		Statement stmt=DBUtil.getConnection().createStatement();
		
		String query="insert into student (rollno,name,mobile) values(1,'Snehal',9876543210)";
		stmt.executeUpdate(query);
		
		
		
	}

}
