import java.util.*;

class Solution {

    public void reverse_string(List<Character> str_List) {

        Stack<Character> stk = new Stack<>();

        for (char c : str_List) {
            stk.push(c);
        }

        for (int i = 0; i < str_List.size(); i++) {

            str_List.set(i, stk.pop());
        }
        return;

    }

}

class _01_Reverse_A_String_II {

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

        sol.reverse_string(str_List);

        System.out.println("Reversed Character list: " + str_List);

        sc.close();

    }

}