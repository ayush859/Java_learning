import java.util.*;

class Employee {
    private String name;
    protected int employeeId;
    private double salary;

    Employee(String name, int employeeid, double salary) {
        this.name = name;
        this.employeeId = employeeid;

        setSalary(salary);
    }

    public void setSalary(double salary) {
        if (salary < 0)
            this.salary = 0.00;
        else
            this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Employee Id:  " + this.employeeId);
        System.out.printf("Salary: %.2f \n", this.salary);
    }

}

// This is the driver code that will execute and demonstrate the functionality
// of your `Employee` class.

// It creates a object of class `Employee`, the parameterised constructor sets
// the values of nam, employeeId, salary attributes.
// It calls the getSalary method to display the salary set by parameterised
// constructor.
// It then calls the setSalary mehod to set the newSalary.
// Then simple displayEmployeeDetails is called to prin the details of employee
// in specified format.

// Main class to demonstrate the functionality of the Student class
public class _04_Practice_Access_Modifiers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name :");
        String name = sc.nextLine();
        System.out.println("Enter the Employee Id :");
        int employeeId = sc.nextInt();
        System.out.println("Enter the salary :");
        double salary = sc.nextDouble();
        System.out.println("Enter the Updated salary :");
        double newSalary = sc.nextDouble();

        // Create an Employee object
        Employee employee = new Employee(name, employeeId, salary);

        // Get and print the salary
        System.out.printf("Salary : %.2f\n", employee.getSalary());

        // Update the salary
        employee.setSalary(newSalary);

        // Display employee details
        employee.displayEmployeeDetails();

        sc.close();
    }
}

// Below is the output format

// System.out.println("Name : " + name);
// System.out.println("Employee Id : " + employeeId);
// System.out.printf("Salary : %.2f\n" , salary);
