import java.util.Scanner;


// 5 5 5 5 5 5 5 5 5 
// 5 4 4 4 4 4 4 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 2 1 2 3 4 5 
// 5 4 3 2 2 2 3 4 5 
// 5 4 3 3 3 3 3 4 5 
// 5 4 4 4 4 4 4 4 5 
// 5 5 5 5 5 5 5 5 5
class Solution {

    public void pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {

                int left = i;
                int top = j;
                int right = 2 * (n - 1) - j;
                int bottom = 2 * (n - 1) - i;

                System.out.print(n - Math.min(Math.min(left, right), Math.min(top, bottom))+" ");

            }

            System.out.println();

        }
    }
}

class _22_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the pattern: ");
        int n = sc.nextInt();

        Solution sol = new Solution();
        sol.pattern22(n);
        sc.close();

    }
}