import java.util.*;

class Solution {

    public String larg_odd(String str) {

        int n = str.length();
        int last_idx = -1;

        for (int i = n - 1; i >= 0; i--) {
            if ((str.charAt(i) - '0') % 2 != 0) {
                last_idx = i;
                break;
            }

        }

        if(last_idx==-1) return "";

        int start_idx = 0;
        while (start_idx < last_idx && str.charAt(start_idx) == '0')
            start_idx++;

        return str.substring(start_idx, last_idx + 1);
    }
}

class _03_Largest_Odd_Number_In_A_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String str = sc.nextLine();

        Solution sol = new Solution();

        String ans = sol.larg_odd(str);

        System.out.println("Largest odd number: " + ans);

    }

}