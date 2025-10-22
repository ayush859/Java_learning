import java.util.*;

class Solution {
    public int count_digit(int N) {
        int count_digit = 0;
        while (N > 0) {
            count_digit++;
            N /= 10;
        }
        return count_digit;
    }

    public boolean is_Armstrong(int N) {

        int count = count_digit(N);

        int copy_N = N;
        int sum = 0;

        while (copy_N > 0) {
            int last_digit = copy_N % 10;
            sum += Math.pow(last_digit, count);
            copy_N /= 10;
        }

        return sum == N;
    }
}

class _07_Check_If_The_Number_Is_Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number ");
        int N = sc.nextInt();

        Solution sol = new Solution();

        boolean check_val = sol.is_Armstrong(N);

        if (check_val)
            System.out.println("The given Number is a Armstrong Number ");
        else
            System.out.println("The given Number is not a Armstrong Number ");
        sc.close();
    }
}