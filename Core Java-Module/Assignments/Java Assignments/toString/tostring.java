class Employee{

     int id;
    String name;
    double salary;

    public Employee() {
        this.id = 00;
        this.name = "Not given";
        this.salary = 00;

    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public String toString() {
        return "Id:" + this.id + "\nname:" + this.name + "\nsalary:" + this.salary;
    }

    public class tostring {

        public static void main(String[] args) {
            Employee e1 = new Employee(101,"Snehal"100000);
            System.out.println(e1);
            System.out.println(e1.toString());
        }

    }
}
