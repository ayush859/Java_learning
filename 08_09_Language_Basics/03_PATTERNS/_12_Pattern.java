import java.util.Scanner;


// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321
class Solution {

    public void pattern12(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++)
                System.out.print(j);

            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");

            for (int j = i; j > 0; j--)
                System.out.print(j);

                System.out.println();
        }


    }
}

class _12_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the pattern: ");
        int N = sc.nextInt();

        Solution sol = new Solution();
        sol.pattern12(N);

        sc.close();

    }

}
