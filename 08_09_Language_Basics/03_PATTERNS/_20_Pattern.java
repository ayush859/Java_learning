import java.util.Scanner;


// *        *
// **      **
// ***    ***
// ****  ****
// **********
// ****  ****
// ***    ***
// **      **
// *        *
class Solution {
    public void pattern20(int n) {

        for (int i = 0; i < 2 * n - 1; i++) {

            int star = i;

            star = (star >= n) ? (2 * n - i - 2) : star;
            int spaces = 2 * (n - star - 1);
            if (spaces < 0)
                spaces = 0;

            for (int j = 0; j <= star; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < spaces; j++) {

                System.out.print(" ");
            }

            for (int j = 0; j <= star; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

class _20_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the pattern: ");
        int N = sc.nextInt();

        Solution sol = new Solution();
        sol.pattern20(N);

        sc.close();

    }

}
