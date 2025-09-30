import java.util.*;

class Employee {

    protected String name;
    protected int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;

    }

    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);

    }

}

class Manager extends Employee {

    private int teamSize;

    Manager(String name, int id, int teamSize) {
        super(name, id);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {

        super.displayDetails();
        System.out.println("Team Size : " + teamSize);

    }

}

class Engineer extends Employee {

    private String specialization;

    Engineer(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization : " + specialization);

    }

}

// This is the driver code that will execute and demonstrate the functionality
// of your base class `Employee`, driver classes 'Manager', 'Engineer'.".

// It creates a object of class `Manager`, uses the parametrised constructor to
// initialize the attributes of Manager and Employee class.
// It then prints a line with text message "Manager Details".
// Then it calls th displayDetails() method of class Manager which prints
// details of manager.

// It creates a object of class `Engineer`, uses the parametrised constructor to
// initialize the attributes of Engineer and Employee class.
// It then prints a line with text message "Engineer Details".
// Then it calls th displayDetails() method of class Engineer which prints
// details of engineer.

public class _06_Practice_Inheritance {

    public static void main(String[] args) {

        String M_name, E_name, E_specialization;
        int M_id, E_id, M_teamSize;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Manager details : \nM_name  M_id  M_teamSize ");
        M_name = sc.next();
        M_id = sc.nextInt();
        M_teamSize = sc.nextInt();

        System.out.println("Enter the Engineer details : \nE_name  E_id  E_specialization ");
        E_name = sc.next();
        E_id = sc.nextInt();
        E_specialization = sc.next();

        System.out.println();

        // Create Manager instance
        Manager manager = new Manager(M_name, M_id, M_teamSize);
        System.out.println("Manager Details");
        manager.displayDetails();

        // Create Engineer instance
        Engineer engineer = new Engineer(E_name, E_id, E_specialization);
        System.out.println("\nEngineer Details");
        engineer.displayDetails();
    }
}

// Below is the output statements

// System.out.println("Name : " + name);
// System.out.println("Id : " + id);
