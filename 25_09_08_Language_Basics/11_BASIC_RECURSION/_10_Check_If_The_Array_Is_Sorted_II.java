import java.util.*;

class Solution {

    public boolean R_is_arr_sort(int[] arr, int index1, int index2) {

        if (index2 >= arr.length) {
            return true;
        }

        if (arr[index1] > arr[index2])
            return false;

        return R_is_arr_sort(arr, index1 + 1, index2 + 1);

    }
}

class _10_Check_If_The_Array_Is_Sorted_II {

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

        boolean check = sol.R_is_arr_sort(arr, 0, 1);

        System.out.println(check ? "Array is sorted" : "Array is not sorted");

    }

}