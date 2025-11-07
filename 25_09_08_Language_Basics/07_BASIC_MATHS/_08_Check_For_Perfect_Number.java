import java.util.*;

class Solution {

    public boolean is_Perfect(int N) {

        int sum = 0;
        for (int i = 1; i < N; i++) {
            if (N % i == 0)
                sum += i;
        }
        return sum == N;
    }
}

class _08_Check_For_Perfect_Number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number ");
        int N = sc.nextInt();

        Solution sol = new Solution();

        boolean check_val = sol.is_Perfect(N);

        if (check_val)
            System.out.println("The given Number is a Perfect Number ");
        else
            System.out.println("The given Number is not a Perfect Number ");
        sc.close();
    }
}