import java.util.Scanner;

// *****
// ****
// ***
// **
// *

class Solution {

    public void pattern5(int n) {

        for (int i = n ; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

class _05_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the pattern: ");
        int N = sc.nextInt();

        Solution sol = new Solution();
        sol.pattern5(N);

        sc.close();
    }

}
