import java.util.*;

class Solution {

    public boolean is_anagram(String str1, String str2) {

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);

    }

}

class _07_Valid_Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String ");

        String str1 = sc.nextLine();

        System.out.println("Enter the Second  String ");

        String str2 = sc.nextLine();

        Solution sol = new Solution();

        boolean check = sol.is_anagram(str1, str2);

        if (check)
            System.out.println("Both Strings are Anagram");
        else
            System.out.println("Both Strings are not Anagram");

    }

}