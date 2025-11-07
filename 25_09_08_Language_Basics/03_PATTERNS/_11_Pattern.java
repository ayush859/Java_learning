import java.util.Scanner;


// 0
// 01
// 010
// 0101
// 01010
class Solution {

    public void pattern10(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                int start_val = 0;

                if (j % 2 == 1)
                    start_val = 1;
                else
                    start_val = 0;

                System.out.print(start_val);

            }

            System.out.println();

        }

    }
}

class _11_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the pattern: ");
        int N = sc.nextInt();

        Solution sol = new Solution();
        sol.pattern10(N);

        sc.close();
    }

}