import java.util.*;

class Solution {

    public void R_arr_reverse(int[] arr, int left, int right) {

        if (left >= right)
            return;

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        R_arr_reverse(arr, left + 1, right - 1);

    }

    public void print_arr(int[] arr) {
        
        for (int a : arr) {
            System.out.print(a + " ");
        } 
        System.out.println();
    }
}

public class _09_Reverse_An_Array {

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

        System.out.print("Original Array elements: ");
        sol.print_arr(arr);

        sol.R_arr_reverse(arr, 0, n - 1);

        System.out.print("Reversed Array elements: ");

        sol.print_arr(arr);

    }

}
