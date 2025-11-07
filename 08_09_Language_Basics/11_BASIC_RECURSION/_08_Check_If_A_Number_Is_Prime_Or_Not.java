import java.util.*;

class Solution {

    public boolean R_is_prime(int N,int divisor) {

        if(divisor >= N) return true;

        if(N%divisor==0) return false;

        return R_is_prime(N, divisor+1);
         
    }

}

class _08_Check_If_A_Number_Is_Prime_Or_Not {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number ");
        int N = sc.nextInt();

        Solution sol = new Solution();

        boolean check = sol.R_is_prime(N,2);

        if (check)
            System.out.println("The given Number is a Prime Number ");
        else
            System.out.println("The given Number is not a Prime Number ");

    }

}