package TypeCasting.ObjectCasting;

public class Employee {
    public Employee() {
        System.out.println("Employee");
    }
    public void print() {
        System.out.println("Employee Details");
    }
}

class Manager extends Employee{
    public Manager() {
        System.out.println("Manager");
    }
    public void print() {
        System.out.println("Manager Details");
    }
}

class Supervision extends Employee{
    public Supervision () {
        System.out.println("Supervision");
    }
    public void print() {
        System.out.println("Supervision Details");
    }
}

class Test {
    public static void main(String[] args) {
        Employee emp1, emp2;
        Manager m1;
        Supervision s1;

        emp1 = new Manager();
        emp2 = new Supervision();
        Employee emp3 = new Manager();

        //Casting
        m1 = (Manager) emp1;
        s1 = (Supervision) emp2;

        emp3.print();
    }
}

