import java.util.Scanner;

// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********
class Solution {

    public void pattern19(int n) {

        for (int i = 0; i < 2 * n; i++) {

            int stars = i;

            stars = (stars >= n) ? 2 * n - i - 1 : stars;

            for (int j = 0; j < n - stars; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < 2 * stars; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

class _19_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the pattern: ");
        int N = sc.nextInt();

        Solution sol = new Solution();
        sol.pattern19(N);

        sc.close();

    }

}