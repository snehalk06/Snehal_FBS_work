package demo;

import java.sql.SQLException;
import java.util.Scanner;

public class Studentdf {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StudentDAOImpl dao =
				new StudentDAOImpl();

		while(true) {

			System.out.println(
			"\n1.Add Student");
			System.out.println(
			"2.Display All");
			System.out.println(
			"3.Search Student");
			System.out.println(
			"4.Update Student");
			System.out.println(
			"5.Delete Student");
			System.out.println(
			"6.Exit");

			System.out.print(
			"Enter Choice : ");

			int choice = sc.nextInt();

			switch(choice) {

			case 1:
				
				System.out.println("enter rollno  ,name ,makrs,adress,mobno");
				System.out.print("Enter Roll No: ");
				int rollno = sc.nextInt();

				System.out.print("Enter Name: ");
				String name = sc.next();

				System.out.print("Enter Marks: ");
				int marks = sc.nextInt();

				System.out.print("Enter Mobile No: ");
				long mobno = sc.nextLong();
				Student s1=new Student(rollno,name,marks,mobno);
				try {
					dao.addStudent(s1);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
				

			case 2:
				//dao.displayAllStudents();
				break;

			case 3:
				System.out.print(
				"Enter Roll No : ");
				int roll =
				sc.nextInt();

			//.searchStudent(roll);
				break;

			case 4:
				System.out.print(
				"Enter Roll No : ");
				roll = sc.nextInt();

				//dao.updateStudent(roll);
				break;

			case 5:
				System.out.print(
				"Enter Roll No : ");
				roll = sc.nextInt();

				//dao.deleteStudent(roll);
				break;

			case 6:
				System.exit(0);

			default:
				System.out.println(
				"Invalid Choice");
			}
		}
	}
}