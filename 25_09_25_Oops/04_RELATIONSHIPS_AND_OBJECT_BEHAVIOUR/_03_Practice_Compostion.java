import java.util.*;

class College {

    private String name;
    private int id;

    College(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("College Name : " + name);
        System.out.println("College ID : " + id);
    }

}

class University {

    private String name;
    private ArrayList<College> colleges;

    University(String name) {
        this.name = name;
        this.colleges = new ArrayList<>();
    }

    public void addCollege(String collegeName, int collegeId) {
        colleges.add(new College(collegeName, collegeId));
    }

    public void displayDetails() {
        System.out.println("University Name : " + name);
        for (College college : colleges) {
            college.displayDetails();
        }
    }

}

// Below is the output format

// System.out.println("University Name : " + name);
// System.out.println("College Name : " + name);
// System.out.println("College ID : " + id);

public class _03_Practice_Compostion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter University Name: ");
        String name = scanner.nextLine();

        University university = new University(name);

        System.out.println("Enter number of colleges: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter College Name: ");
            String cName = scanner.nextLine();

            System.out.println("Enter College ID: ");
            int cId = scanner.nextInt();
            scanner.nextLine();

            university.addCollege(cName, cId);
        }

        university.displayDetails();

        scanner.close();

    }
}
