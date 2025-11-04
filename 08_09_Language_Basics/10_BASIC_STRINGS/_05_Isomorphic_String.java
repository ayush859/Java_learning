import java.util.*;

class Solution {

    public boolean is_Ismorphic(String s, String t) {

        int[] arr1 = new int[256];
        int[] arr2 = new int[256];

        int n = s.length();

        for (int i = 0; i < n; i++) {

            if (arr1[s.charAt(i)] != arr2[t.charAt(i)]) {

                return false;
            }

            arr1[s.charAt(i)] = i + 1;
            arr2[t.charAt(i)] = i + 1;

        }

        return true;

    }

}

class _05_Isomorphic_String {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first String ");

        String str_s = sc.nextLine();

        System.out.println("Enter the Second String ");

        String str_t = sc.nextLine();

        Solution sol = new Solution();

        boolean check = sol.is_Ismorphic(str_s, str_t);

        if (check)
            System.out.println("Strings are isomorphic.");
        else
            System.out.println("Strings are not isomorphic.");

    }

}