import java.util.*;

class Solution {
    public int countDigit(int n) {

        if (n == 0)
            return 1;

        int cnt = 0;

        while (n > 0) {
            cnt = cnt + 1;
            n = n / 10;
        }
        return cnt;
    }
}

class _01_Count_All_Digits_Of_a_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number ");
        int N = sc.nextInt();

        Solution sol = new Solution();

        int ans = sol.countDigit(N);

        System.out.println("The count of digits in the given number is: " + ans);

        sc.close();
    }
}
