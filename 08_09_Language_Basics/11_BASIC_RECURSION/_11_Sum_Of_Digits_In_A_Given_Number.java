import java.util.*;

class Solution {

    public int add_digits(int num) {

        if (num == 0)
            return 0;

        return num % 10 + add_digits(num / 10);
    }

    public int sum_of_digits(int N) {

        if (N < 10) {
            return N;

        }

        int sum = add_digits(N);

        return sum_of_digits(sum);

    }
}

class _11_Sum_Of_Digits_In_A_Given_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int N = sc.nextInt();

        Solution sol = new Solution();

        int ans = sol.sum_of_digits(N);

        System.out.println("Sum of digits: " + ans);

    }

}
