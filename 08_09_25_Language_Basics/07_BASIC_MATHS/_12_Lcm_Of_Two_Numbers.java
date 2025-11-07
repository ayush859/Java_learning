import java.util.*;

class Solution {

    public int Lcm_Result(int m, int n) {

        int lcm;
        int large_val = Math.max(m, n);
        int counter = 1;

        while (true) {

            int multiples = large_val * counter;

            if (multiples % m == 0 && multiples % n == 0) {
                lcm = multiples;
                break;

            }
            counter++;

        }
        return lcm;

    }
}

class _12_Lcm_Of_Two_Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number ");
        int m = sc.nextInt();
        System.out.print("Enter the Second Number ");
        int n = sc.nextInt();
        Solution sol = new Solution();

        int ans = sol.Lcm_Result(m, n);

        System.out.println("The Lcm of the two no. (" + m + "," + n + ") is: " + ans);

        sc.close();
    }
}