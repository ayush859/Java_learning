import java.util.Scanner;

class Solution {
    public char lastChar(String s) {
        return s.charAt(s.length() - 1);
    }
}

public class _01_Print_Last_Character_Of_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        Solution sol = new Solution();
        char ans = sol.lastChar(s);

        System.out.println("The last character is: " + ans);

        scanner.close();
    }
}
