import java.util.Scanner;


// A
// AB
// ABC
// ABCD
// ABCDE
class Solution {

    public void pattern14(int n) {

        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);

            }
            System.out.println();
        }

    }

}

class _14_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the pattern: ");
        int N = sc.nextInt();

        Solution sol = new Solution();
        sol.pattern14(N);

        sc.close();

    }

}