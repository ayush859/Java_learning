import java.util.*;

class Solution {

    public boolean R_is_palindrome(String str, int left, int right) {

        if (left >= right)
            return true;

            char ch_left = str.charAt(left);
            char ch_right = str.charAt(right);

            if( ch_left != ch_right) return false;

            return R_is_palindrome(str,left+1,right-1);

    }
}

class _07_Check_If_String_Is_Palindrome_Or_Not {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");

        String str = sc.next();

        Solution sol = new Solution();

        boolean check = sol.R_is_palindrome(str, 0, str.length() - 1);

        if (check)
            System.out.println("The given String is a palindrome.");
        else
            System.out.println("The given String is not a palindrome.");

    }

}