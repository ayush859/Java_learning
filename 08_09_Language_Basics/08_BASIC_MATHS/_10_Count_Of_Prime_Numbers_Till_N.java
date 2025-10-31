import java.util.Scanner;

class Solution {

    public boolean is_Prime(int n) {

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public int Count_Prime_till_N(int N) {

        int count = 0;

        for (int i = 2; i <= N; i++) {

            if (is_Prime(i))
                count++;

        }
        return count;

    }

}

public class _10_Count_Of_Prime_Numbers_Till_N {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number ");
        int N = sc.nextInt();

        Solution sol = new Solution();

        int total_count = sol.Count_Prime_till_N(N);

        System.out.println("The count of primes till " + N + " is: " + total_count);

        sc.close();
    }
}