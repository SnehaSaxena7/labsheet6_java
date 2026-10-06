abstract class AbstractEmployee10 {

    abstract double calculateSalary();

    abstract void displayInfo();
}

class Manager10 extends AbstractEmployee10 {

    String name = "Rahul";
    double salary = 60000;

    @Override
    double calculateSalary() {
        return salary;
    }

    @Override
    void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Manager Salary: " + calculateSalary());
    }
}

class Programmer10 extends AbstractEmployee10 {

    String name = "Amit";
    double salary = 50000;

    @Override
    double calculateSalary() {
        return salary;
    }

    @Override
    void displayInfo() {
        System.out.println("Programmer Name: " + name);
        System.out.println("Programmer Salary: " + calculateSalary());
    }
}

public class Experiment10_AbstractEmployee {

    public static void main(String[] args) {

        AbstractEmployee10 manager = new Manager10();
        AbstractEmployee10 programmer = new Programmer10();

        manager.displayInfo();

        System.out.println();

        programmer.displayInfo();
    }
}