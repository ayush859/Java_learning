import java.util.Scanner;

class Solution {
    public void studentGrade(int marks) {
        if(marks>=90)  System.out.println("Grade A");
        else if (marks>=70)  System.out.println("Grade B");
        else if (marks >=50)  System.out.println("Grade c");
        else if(marks>=35)  System.out.println("Grade D");
        else  System.out.println("Failed");

    }
}

 

 class _01_If_Elseif {
    public static void main(String[] args) {
        // Creating an instance of Solution class
        Solution solution = new Solution();
        int marks;

        // Taking marks as input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        marks = sc.nextInt();

        // Function call to println the grades based on marks
        solution.studentGrade(marks);
    	sc.close();
    
    }
}
