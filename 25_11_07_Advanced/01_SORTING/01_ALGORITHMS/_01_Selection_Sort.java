import java.util.*;

class Solution {

    public void select_sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int min_index = i;

            for (int j = i + 1; j < arr.length ; j++) {

                if (arr[j] < arr[min_index])
                    min_index = j;
            }

            if (min_index != i) {
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;

            }

        }

    }

    public void print_arr(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}

class _01_Selection_Sort {

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

        sol.select_sort(arr);

        System.out.print("Sorted array: ");
        sol.print_arr(arr);

    }

}