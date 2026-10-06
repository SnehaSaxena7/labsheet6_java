class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    double getSalary() {
        return 50000;
    }
}

class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is managing employees");
    }

    void addEmployee() {
        System.out.println("Employee added successfully");
    }
}

public class Experiment04_EmployeeHRManager {
    public static void main(String[] args) {
        HRManager hr = new HRManager();

        hr.work();
        System.out.println("Salary = " + hr.getSalary());
        hr.addEmployee();
    }
}