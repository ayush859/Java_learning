import java.util.Scanner;

class Student {

    private String name;
    private int rollNumber;

    public void setDetails(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayDetails() {
        System.out.println("Name : " + this.name);
        System.out.println("Roll Number : " + this.rollNumber);
    }
}

// It creates a `Student` object, initializes its details using user input, and
// displays the details using the provided methods.

// Main class to demonstrate the functionality of the Student class

public class _04_Practice_classes_And_Objects {
    public static void main(String[] args) {

        // Create a Scanner object for taking input from the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Name of the Student: ");

        String name = sc.nextLine(); // Read the name as a string input

        System.out.print("Enter the Roll Number of the Student: ");

        int rollNumber = sc.nextInt(); // Read the roll number as an integer input

        // Create an object of the Student class
        Student student = new Student();

        // Set the details of the student using the setDetails() method
        student.setDetails(name, rollNumber);

        // Display the student's details using the displayDetails() method
        student.displayDetails();

        // Close the Scanner to free resources
        sc.close();
    }
}

// Below are the output statements

// System.out.println("Name : " + this.name);
// System.out.println("Roll Number : " + this.rollNumber);
