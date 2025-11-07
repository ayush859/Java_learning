import java.util.*;

class Solution {

    public int R_arr_sum(int[] arr, int index) {

        if (index >= arr.length)
            return 0;

        return arr[index] + R_arr_sum(arr, index + 1);
    }
}

class _05_Sum_Of_Array_Elements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the arr: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the arr: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int ans = sol.R_arr_sum(arr, 0);

        System.out.println("The sum of all elements of arr is " + ans);

    }

}
