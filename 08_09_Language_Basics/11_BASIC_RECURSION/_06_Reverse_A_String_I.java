import java.util.*;

class Solution {

    public void R_reverse_str(List<Character> str_List, int left, int right) {

        if (left >= right)
            return;

        char temp = str_List.get(left);
        str_List.set(left, str_List.get(right));
        str_List.set(right, temp);

        R_reverse_str(str_List, left + 1, right - 1);

    }
}

class _06_Reverse_A_String_I {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();

        List<Character> str_List = new ArrayList<>();

        for (char c : str.toCharArray()) {
            str_List.add(c);
        }

        System.out.println("Original Character list: " + str_List);

        Solution sol = new Solution();

        int left = 0, right = str_List.size()-1;
        sol.R_reverse_str(str_List, left, right);

        System.out.println("Reversed Character list: " + str_List);

    }

}