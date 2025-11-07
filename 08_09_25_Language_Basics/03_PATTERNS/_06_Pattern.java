import java.util.Scanner;

// 12345
// 1234
// 123
// 12
// 1

class Solution {


    public void pattern6(int n) {

        for (int i = n ; i > 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

}

class _06_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the pattern: ");
        int N = sc.nextInt();

        Solution sol = new Solution();
        sol.pattern6(N);

        sc.close();
    }

}
