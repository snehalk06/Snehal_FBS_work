package dao;

import java.sql.Date;
import java.util.Scanner;

import dao.StudentDAO;
import model.Student;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentDAO dao =
                new StudentDAO();

        while(true) {

            System.out.println("\n1.Add");
            System.out.println("2.View");
            System.out.println("3.Delete");
            System.out.println("4.Update Marks");
            System.out.println("5.Birthday Wishes");
            System.out.println("6.Exit");
            
            System.out.println("Enter your choice:");

            int choice = sc.nextInt();

            switch(choice) {

            case 1:

                Student s = new Student();

                System.out.println("Enter Roll No");
                s.setRollno(sc.nextInt());

                sc.nextLine();

                System.out.println("Enter Name");
                s.setName(sc.nextLine());

                System.out.println("Enter Marks");
                s.setMarks(sc.nextDouble());

                sc.nextLine();

                System.out.println("Enter Mobile");
                s.setMobno(sc.nextLine());

                System.out.println("Enter Address");
                s.setAddress(sc.nextLine());

                System.out.println("Enter DOB(yyyy-mm-dd)");
                s.setDob(Date.valueOf(sc.nextLine()));

                dao.addStudent(s);

                break;

            case 2:
                dao.viewStudents();
                break;

            case 3:

                System.out.println("Enter Roll No");

                dao.deleteStudent(
                        sc.nextInt());

                break;

            case 4:

                System.out.println("Roll No");

                int roll =
                        sc.nextInt();

                System.out.println("New Marks");

                double marks =
                        sc.nextDouble();

                dao.updateMarks(
                        roll, marks);

                break;

            case 5:

                dao.birthdayWish();

                break;

            case 6:

                System.exit(0);
            }
        }
    }
}