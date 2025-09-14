import java.util.Scanner;

class Solution {
  
    public void isAdult(int age) {
        
        
        if (age >= 18) {
           
            System.out.println("Adult");
        } 
        
       
        else {
            
            System.out.println("Teen");
        }
    }
}

class _01_If_Else_Adult_Teen_Problem {
    public static void main(String[] args) { 
        Solution solution = new Solution();

         
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

         
        solution.isAdult(age);
    }
}
