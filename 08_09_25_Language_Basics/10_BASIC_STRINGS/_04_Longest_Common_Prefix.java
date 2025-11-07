import java.util.*;

class Solution {

    public String common_pref(String[] arr) {

        StringBuilder ans = new StringBuilder();

        Arrays.sort(arr);

        String first = arr[0];
        String last = arr[arr.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {

            if (first.charAt(i) != last.charAt(i))
                return ans.toString();

            ans.append(first.charAt(i));
        }

        return ans.toString();

    }

}

class _04_Longest_Common_Prefix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter strings separated by space:");
        String[] arr = sc.nextLine().split(" ");

        System.out.println("Original string array: " + Arrays.toString(arr));

        Solution sol = new Solution();

        String ans = sol.common_pref(arr);

        System.out.println("Longest Common Prefix: " + ans); 

    }

}

// give input like this => lady lazy landing 