class Employee{
    String EmployeeName;
    double salary;
    static double bonusRate=2;

    public  Employee(String name ,double salary)
    {
        this.EmployeeName=name;
        this.salary=salary;
    }
    static void updateBonusRate(double bonusRate)
    {
        Employee.bonusRate=bonusRate;
    }
    double CalculateSalary()
    {
        return salary=salary+(salary*bonusRate/100);
    }
    void displayEmployee(){
        System.out.println("Employee name: "+this.EmployeeName);
        System.out.println("Employee BonusRate:"+Employee.bonusRate);
        System.out.println("Salary="+this.salary);
        System.out.println("salary:"+CalculateSalary());
    }
}
public class EmployeeSalaryCalculation {
    public static void main(String[] args) {
        Employee e1=new Employee("Snahel", 200000);
        Employee e2=new Employee("Pratrik", 250000);

        e1.displayEmployee();
        e2.displayEmployee();

        ////update bonusRate
        System.out.println("After bonus update");
        Employee.updateBonusRate(8);
        e1.displayEmployee();
        e2.displayEmployee();

    }
    
}
