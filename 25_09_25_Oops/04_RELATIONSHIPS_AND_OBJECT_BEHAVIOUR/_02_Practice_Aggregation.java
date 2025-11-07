import java.util.*;

class Department {

    private String name;
    private String id;

    Department(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {

        System.out.println("Department Name : " + name);
        System.out.println("Department Id : " + id);

    }

}

class Employee {

    private String name;
    private int id;
    private Department department;

    Employee(String name, int id, Department department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public void displayDetails() {

        System.out.println("Employee Name : " + name);
        System.out.println("Employee Id : " + id);

        if (department != null)
            department.displayDetails();
    }
}

// Design a system to manage the relationship between Employees and Departments
// using aggregation. Implement the following:

// Department :
// Attributes: name (String), id (String).
// Method: displayDetails() - Prints the department details.
// Employee :
// Attributes: name (String), id (int), department (Department).
// Method: displayDetails() - Prints the employee details, including the
// associated department details.



class _02_Practice_Aggregation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name: ");
        String E_name = sc.nextLine();

        System.out.println("Enter Employee Id: ");
        int E_id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Department Name: ");
        String D_name = sc.nextLine();

        System.out.println("Enter Department Id: ");
        String D_id = sc.nextLine();

        // creats a object of Department class with D_name, D_id as the arguments
        Department department = new Department(D_name, D_id);

        // creates a object of Employee class with E_name, E_id, department as the
        // arguments
        Employee employee = new Employee(E_name, E_id, department);

        // calls the display method using the employee object
        employee.displayDetails();

        sc.close();

    }
}


// Below is the output format

// System.out.println("Employee Name : " + name);
// System.out.println("Employee Id : " + id);
// System.out.println("Department Name : " + name);
// System.out.println("Department Id : " + id);

















