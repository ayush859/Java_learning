import java.util.Scanner;


// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
class Solution {

    public void pattern10(int n) {

        for (int i = 1; i <= 2 * n; i++) {

            int stars = i;
            if (i > n)
                stars = 2 * n - i;

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

}

class _10_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the pattern: ");
        int N = sc.nextInt();

        Solution sol = new Solution();
        sol.pattern10(N);

        sc.close();
    }

}