abstract class Employee {
    int id;
    String name;
    double salary;

    public Employee() {
        this.id = 0;
        this.name = "not given";
        this.salary = 0;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void setID(int id) {
        this.id = id;
    }

    void setName(String name) {
        this.name = name;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    int getID() {
        return this.id;
    }

    String getName() {
        return this.name;
    }

    double getSalary() {
        return this.salary;
    }

    abstract void display();
}

// Admin class
class Admin extends Employee {
    double allowance;

    public Admin() {
        super();
        this.allowance = 0;
    }

    public Admin(double allowance, int id, String name, double salary) {
        super(id, name, salary);
        this.allowance = allowance;
    }

    void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    double getAllowance() {
        return this.allowance;
    }

    void display() {
        System.out.println("----- Admin Department ------");
        //super.display();
        System.out.println("Employee ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Allowance: " + allowance);
    }
}

// SalesManager class
class SalesManager extends Employee {
    double incentive, target;

    public SalesManager() {
        super();
        this.incentive = 0;
        this.target = 0;
    }

    public SalesManager(double incentive, double target, int id, String name, double salary) {
        super(id, name, salary);
        this.incentive = incentive;
        this.target = target;
    }

    void setIncentive(double incentive) {
        this.incentive = incentive;
    }

    void setTarget(double target) {
        this.target = target;
    }

    double getIncentive() {
        return this.incentive;
    }

    double getTarget() {
        return this.target;
    }

    void display() {
        System.out.println("----- SalesManager Department -----");
        //super.display();
        System.out.println("Employee ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Incentive: " + incentive);
        System.out.println("Target: " + target);
    }
}

// HR class
class HR extends Employee {
    double commission;

    public HR() {
        super();
        this.commission = 0;
    }

    public HR(double commission, int id, String name, double salary) {
        super(id, name, salary);
        this.commission = commission;
    }

    void setCommission(double commission) {
        this.commission = commission;
    }

    double getCommission() {
        return this.commission;
    }

    void display() {
        System.out.println("----- HR Department ----");
        //super.display();
        System.out.println("Employee ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Commission: " + commission);
    }
}

// Main class
public class EmployeeHierarchy {
    public static void main(String[] args) {

        Employee e1;

        Admin a = new Admin(2000, 1, "Snehal", 40000);
        a.display();

        Admin a2 = new Admin();
        a2.setID(101);
        a2.setName("Rudra");
        a2.setAllowance(1200);
        a2.setSalary(40000);
        a2.display();

        SalesManager sm = new SalesManager(4000, 20000, 3, "Snehal", 30000);
        sm.display();

        HR h = new HR(1000, 5, "Pratik", 35000);
        h.display();
    }
}