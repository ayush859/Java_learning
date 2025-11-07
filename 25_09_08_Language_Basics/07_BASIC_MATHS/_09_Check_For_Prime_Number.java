import java.util.*;

class Solution {

    public boolean is_Prime(int n){

        for(int i=2;i<=n/2;i++){
            if (n%i==0) return false;
        }
        return true;
    }

}

public class _09_Check_For_Prime_Number   {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number ");
        int N = sc.nextInt();

        Solution sol = new Solution();

        boolean check_val = sol.is_Prime(N);

        if (check_val)
            System.out.println("The given Number is a Prime Number ");
        else
            System.out.println("The given Number is not a Prime Number ");
        sc.close();
    }
}