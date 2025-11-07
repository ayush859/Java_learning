import java.util.Scanner;


// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15
class Solution {
    public void pattern13(int n) {
        int temp = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(temp++  + " ");
            }
            System.out.println();
        }
    }
}

class _13_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the pattern: ");
        int N = sc.nextInt();

        Solution sol = new Solution();
        sol.pattern13(N);

        sc.close();
    }

}