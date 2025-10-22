import java.util.*;

class Solution {

    public boolean Is_Palindrome(int N) {

        int copy_N = N;
        int reverse_dig = 0;

        while (N > 0) {
            int last_digit = N % 10;
            reverse_dig = (reverse_dig * 10) + last_digit;
            N /= 10;
        }
        return reverse_dig == copy_N;

    }
}

class _04_Palindrome_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number ");
        int N = sc.nextInt();

        Solution sol = new Solution();

        boolean check_val = sol.Is_Palindrome(N);

        if (check_val)
            System.out.println("The given Number is a Palindrome ");
        else
            System.out.println("The given Number is a Palindrome ");

        sc.close();
    }

}