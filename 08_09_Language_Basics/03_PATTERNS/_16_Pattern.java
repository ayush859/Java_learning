import java.util.Scanner;

class Solution {

    public void pattern16(int n) {
        for (int i = 0; i < n; i++) {

            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

class _16_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the pattern: ");
        int N = sc.nextInt();

        Solution sol = new Solution();
        sol.pattern16(N);

        sc.close();

    }

}