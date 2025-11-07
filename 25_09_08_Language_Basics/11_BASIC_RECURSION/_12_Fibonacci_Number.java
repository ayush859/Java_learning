import java.util.*;

class Solution {

    public int Fibn_of_N(int N) {

        if (N <= 0)
            return 0;

        if (N == 1)
            return 1;

        return Fibn_of_N(N - 1) + Fibn_of_N(N - 2);

    }
}

class _12_Fibonacci_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int N = sc.nextInt();

        Solution sol = new Solution();

        int ans = sol.Fibn_of_N(N);

        System.out.println("Fibonacci number at position " + N + " is: " + ans);
    }

}