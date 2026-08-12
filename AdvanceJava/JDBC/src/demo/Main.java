package demo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class imported sucessfully");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/snehalrevision","root","snehal06");
			
		     Statement stmt =con.createStatement();
		     System.out.println("connection establish sucessfully");
				
		     
		     ResultSet rsResultSet=stmt.executeUpdate("select*from student where marks>82");
		   
		     ArrayList<Student> studentlist=new ArrayList<Student>();
		     
		     while(rsResultSet.next()) {
		    	 Student s=new Student();
		    	 s.setRollno(rsResultSet.getInt("rollno"));
		    	 s.setName(rsResultSet.getString("name"));
		    	s.setDob(rsResultSet.getDate("dob"));
		    	 s.setCity(rsResultSet.getString("city"));
		    	 s.setMobile(rsResultSet.getLong("mobile"));
		    	 s.setMarks(rsResultSet.getInt("marks"));
		    	 
		    	 studentlist.add(s);
		    	 
		    	 
		     }
		     System.out.println( studentlist);
		     
		    
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
