import java.util.*;

class Solution {

    public boolean is_Ismorphic(String str, String goal) {

        if (str.length() != goal.length())
            return false;

        for (int i = 0; i < str.length(); i++) {

            String str1 = str.substring(i);
            String str2 = str.substring(0, i);
            String temp_str = str1 + str2;

            if (temp_str.equals(goal))
                return true;

        }
        return false;

    }

}

class _06_Rotate_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String ");

        String str = sc.nextLine();

        System.out.println("Enter the Second/Goal String ");

        String goal = sc.nextLine();

        Solution sol = new Solution();

        boolean check = sol.is_Ismorphic(str, goal);

        if (check)
            System.out.println("2nd String can be formed by left-shifting 1st String.");
        else
            System.out.println("2nd String cannot be formed by left-shifting 1st String.");

    }

}
