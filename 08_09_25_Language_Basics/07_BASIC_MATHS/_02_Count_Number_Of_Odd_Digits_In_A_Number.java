import java.util.*;

class Solution {

    public int Count_Odd_Digit(int N) {
        if (N == 0) {
            return 0;
        }

        int odd_digit_count = 0;

        while (N > 0) {
            int mod_val = (N % 10) % 2;
            if (mod_val != 0)
                odd_digit_count++;
            N = N / 10;
        }

        return odd_digit_count;
    }

}

class _02_Count_Number_Of_Odd_Digits_In_A_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number ");
        int N = sc.nextInt();

        Solution sol = new Solution();

        int ans = sol.Count_Odd_Digit(N);

        System.out.println("The count of Odd digits in the given number is: " + ans);

        sc.close();
    }

}
