import java.util.*;

class Solution {

    public int R_fact_of_N(int N) {

        if (N == 1 || N == 0)
            return 1;

        return N * R_fact_of_N(N - 1);
    }
}

class _04_Factorial_Of_A_Given_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int N = sc.nextInt();

        Solution sol = new Solution();

        int ans = sol.R_fact_of_N(N);

        System.out.println("Factorial of " + N + " is " + ans);

    }

}