package J;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class imported sucessfully");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/snehalrevision","root","snehal06");
			
		     Statement stmt =con.createStatement();
		     System.out.println("connection establish sucessfully");
				
		     
		     ResultSet rsResultSet=stmt.executeQuery("select*from student");
		    
		    ResultSetMetaData metadata = rsResultSet.getMetaData();		     
		     
		     int columncount=metadata.getColumnCount();
		     
		     for(int i=1;i<columncount;i++) {
		    	 System.out.println(metadata.getColumnName(i)+" ");
		     }
		    	
		     while(rsResultSet.next()) {
		    	 for(int i=1;i<columncount;i++) {
			    	 System.out.print(rsResultSet.getObject(i)+" ");
			     }
		    	System.out.println();
		    	 
		     }
		     System.out.println();
				
			
	
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
