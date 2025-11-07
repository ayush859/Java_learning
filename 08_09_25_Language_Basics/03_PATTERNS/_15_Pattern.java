import java.util.Scanner;


// ABCDE
// ABCD
// ABC
// AB
// A
class Solution {

    public void pattern15(int n) {

        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - 1 - i); ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }

    }
}

class _15_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the pattern: ");
        int N = sc.nextInt();

        Solution sol = new Solution();
        sol.pattern15(N);

        sc.close();

    }

}