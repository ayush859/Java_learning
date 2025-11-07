import java.util.*;

class Solution {

    public int reverse_num(int N) {

        

        int reverse_dig = 0;

        while (N > 0) {

            int last_digit = N % 10;
            reverse_dig = (reverse_dig * 10) + last_digit;
            N /= 10;

        }

        return reverse_dig;
    }
}

class _03_Reverse_A_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number ");
        int N = sc.nextInt();

        Solution sol = new Solution();

        int ans = sol.reverse_num(N);

        System.out.println("The reverse of the given number is: " + ans);

        sc.close();
    }

}