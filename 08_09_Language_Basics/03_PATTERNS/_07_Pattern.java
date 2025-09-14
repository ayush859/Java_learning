import java.util.Scanner;

//    *   
//   ***   
//  *****   
// *******  

class Solution {

    public void pattern7(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");

            }

            for (int j = 1; j < n; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}

class _07_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the pattern: ");
        int N = sc.nextInt();

        Solution sol = new Solution();
        sol.pattern7(N);

        sc.close();
    }

}
