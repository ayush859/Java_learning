import java.util.Scanner;

class Solution {
    // Function to take input and display output 
    public void printNumber(Scanner sc) {
        
        int number;
         
        System.out.println("Enter the Number ");
        number = sc.nextInt();
        
        System.out.println("Printing the input no. "+number);
    }    
}

// Driver code
class _01_Input_Output {
    public static void main(String[] args) {
        // Creating an instance of Solution class
        Solution sol = new Solution();
        
        // Scanner class 
        Scanner sc = new Scanner(System.in);
        
        // Function call to take input and display output
        sol.printNumber(sc);
    }
}


