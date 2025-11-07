import java.util.*;

class Solution {
    public int factorial_N(int N) {

        /* if (N == 1)
            return 1;
        return N * factorial_N(N - 1); */

        int factorial=1;
        for(int i=2;i<=N;i++){
            factorial*=i;
        }
        return factorial;
    }
}

class _06_Factorial_Of_A_Given_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number ");
        int N = sc.nextInt();

        Solution sol = new Solution();

        int ans = sol.factorial_N(N);

        System.out.println("The factorial of the Number is: " + ans);

        sc.close();
    }

}