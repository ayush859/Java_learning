import java.util.*;

class Solution {

    public int Gcd_Result(int m, int n) {

        int gcd = 1;

        for (int i = 1; i <= Math.min(m, n); i++) {
            if (m % i == 0 && n % i == 0)
                gcd = i;
        }
        return gcd;
    }

}

class _11_Gcd_Of_Two_Numbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number ");
        int m = sc.nextInt();
        System.out.print("Enter the Second Number ");
        int n = sc.nextInt();
        Solution sol = new Solution();

        int ans = sol.Gcd_Result(m, n);

        System.out.println("The Gcd of the two no. (" + m + "," + n + ") is: " + ans);

        sc.close();
    }
}