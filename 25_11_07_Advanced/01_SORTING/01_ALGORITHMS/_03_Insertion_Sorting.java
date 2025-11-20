import java.util.*;

class Solution {

    public void insertion_sort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int curr_ele = arr[i];

            int prev_ind = i - 1;

            while (prev_ind >= 0 && arr[prev_ind] > curr_ele) {

                arr[prev_ind + 1] = arr[prev_ind];
                prev_ind--;
            }

            arr[prev_ind + 1] = curr_ele;

        }

    }

    public void print_arr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}

class _03_Insertion_Sorting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the arr: ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the arr ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Solution sol = new Solution();

        System.out.print("Original array: ");
        sol.print_arr(arr);

        sol.insertion_sort(arr);

        System.out.print("Sorted array: ");
        sol.print_arr(arr);
    }

}