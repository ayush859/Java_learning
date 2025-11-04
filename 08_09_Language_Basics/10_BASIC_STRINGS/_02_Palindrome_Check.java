import java.util.*;

class Solution {

       public boolean approach2_is_Palindrome(String str) {  
                                                
        int left_ind = 0;
        int right_ind = str.length() - 1;

        while (left_ind < right_ind) {

            if (str.charAt(left_ind++) != str.charAt(right_ind--))
                return false;

        }

        return true;
    }

    public boolean approach1_is_Palindrome(List<Character> str_List) {

        List<Character> temp_str = new ArrayList<>(str_List);

        Stack<Character> stk = new Stack<>();

        for (char c : str_List) {
            stk.push(c);
        }

        for (int i = 0; i < str_List.size(); i++) {
            temp_str.set(i, stk.pop());

        }

         return temp_str.equals(str_List);
    }

}

class _02_Palindrome_Check {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String str = sc.nextLine();
        
        List<Character> str_List = new ArrayList<>();
        
        for (char c : str.toCharArray()) {
            str_List.add(c);
        }


        Solution sol = new Solution();

        boolean check = sol.approach1_is_Palindrome(str_List);
        // boolean check = sol.approach2_is_Palindrome(str);

        if (check)
            System.out.println("The given String is a palindrome.");
        else
            System.out.println("The given String is not a palindrome.");

    }
}