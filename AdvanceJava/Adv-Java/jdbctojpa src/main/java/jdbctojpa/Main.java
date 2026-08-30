package jdbctojpa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeService service = new EmployeeService();

        int choice;

        do {

            System.out.println("\n======================================");
            System.out.println("          EMPLOYEE MANAGEMENT");
            System.out.println("======================================");

            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Search Employee");
            System.out.println("5. Display All Employees");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:
                service.addEmployee();
                break;

            case 2:
                service.updateEmployee();
                break;

            case 3:
                service.deleteEmployee();
                break;

            case 4:
                service.searchEmployee();
                break;

            case 5:
                service.displayAllEmployees();
                break;

            case 0:
                System.out.println("Thank You...!");
                break;

            default:
                System.out.println("Invalid Choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}