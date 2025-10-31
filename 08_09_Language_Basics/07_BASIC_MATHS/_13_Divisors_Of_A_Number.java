import java.util.*;

class Solution {
    /*
     * Function to find all
     * divisors of n
     */
    public int[] divisors(int n) { 

        int[] temp_arr = new int[n];
        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                temp_arr[count++] = i;
            }
        }
        
        int[] ans = Arrays.copyOf(temp_arr, count);
         
        return ans;
    }
}

public class _13_Divisors_Of_A_Number {

    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the  Number ");
        int n = sc.nextInt();

        
        Solution sol = new Solution();

         
        int[] ans = sol.divisors(n);

        System.out.print("The divisors of " + n + " are: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

}
