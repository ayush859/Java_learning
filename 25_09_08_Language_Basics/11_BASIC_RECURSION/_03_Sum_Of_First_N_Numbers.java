import java.util.*;

class Solution {

    public int R_sum_till_N(int n) {

        if (n == 1)
            return 1;

        return n + R_sum_till_N(n - 1);

    }
}

class _03_Sum_Of_First_N_Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int N = sc.nextInt();

        Solution sol = new Solution();

        int ans = sol.R_sum_till_N(N);

        System.out.println("Sum of first " + N + " numbers is " + ans);

    }

}