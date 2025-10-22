import java.util.*;

class Solution {

    public int largest_digit_in_num(int N) {

        int large_digit = 0;
        while (N > 0) {
            int current_digit = N % 10;
            if (current_digit >= large_digit)
                large_digit = current_digit;
            N /= 10;
        }
        return large_digit;
    }

}

class _05_Return_The_Largest_Digit_In_A_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number ");
        int N = sc.nextInt();

        Solution sol = new Solution();

        int ans = sol.largest_digit_in_num(N);

        System.out.println("The largest digit in the Number is: " + ans);

        sc.close();
    }
}