import java.util.Scanner;


//     *    
//    ***    
//   *****    
//  *******    
// *********    
// *********
//  ******* 
//   *****  
//    ***   
//     *  
class Solution {

    public void pattern7(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            for (int j = 1; j < n; j++)
                System.out.print(" ");

            System.out.println();
        }

    }

    public void pattern8(int n) {

        for (int i = n; i > 0; i--) {

            for (int j = 0; j < (n - i); j++)
                System.out.print(" ");

            for (int j = 0; j < (2 * i) - 1; j++)
                System.out.print("*");

            for (int j = 0; j < (n - i); j++)
                System.out.print(" ");

            System.err.println("");
        }

    }

    public void pattern9(int n) {

        pattern7(n);
        pattern8(n);
    }
}

class _09_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the pattern: ");
        int N = sc.nextInt();

        Solution sol = new Solution();
        sol.pattern9(N);

        sc.close();
    }

}