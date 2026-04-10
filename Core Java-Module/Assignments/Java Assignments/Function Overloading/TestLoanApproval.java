

class Bank{
    void approveloan(Student s)
    {
        if(s.percentage>80)
        {
            System.out.println("loan amount :2,00,000");
        }
        else if(s.percentage>=60)
        {
            System.out.println("Loan amount : 1,00,000");

        }
        else if(s.percentage>=40)
        {
            System.out.println("Loan amount : 50,000");

        }
        else if(s.percentage<40)
        {
            System.out.println("No ;loan approved");
        }
        
    }



    void approveloan(Employee e)
    {
        if(e.annualSalary>=12)
        {
            System.out.println("Loan amount : 7,00,000");
        }
        else if(e.annualSalary>=10)
        {
            System.out.println("loan amount: 6,00,000");
        }
        else if(e.annualSalary>=6)
        {
            System.out.println("loan amount : 5,00,000");
        }
        else if(e.annualSalary>=4)
        {
            System.out.println("Loan amount: 4,00,000");
        }
        else if(e.annualSalary<4)
        {
            System.out.println("No loan amount approved");
        }
        }

}
class Student{
    double rollNo,percentage;
    String name;

    Student(double rollno,String str,double percentage){
        this.rollNo=rollno;
        this.name=str;
        this.percentage=percentage;
    }
}
class Employee{
    double id,annualSalary;
    String name;

    Employee(double id,String str,double salary)
    {
        this.id=id;
        this.name=str;
        this.annualSalary=salary;
    }
}



public class TestLoanApproval {
    public static void main(String[] args) {
    

    Bank b=new Bank();

    Student s=new Student(1,"Snehal",94.60);
    Employee e=new Employee(1,"Pratik",6);

    b.approveloan(s);
    b.approveloan(e);
    }

    
}
