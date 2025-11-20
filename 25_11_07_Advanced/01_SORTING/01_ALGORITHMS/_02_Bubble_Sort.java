import java.util.*;

class Solution {

    public void bubble_sort(int[] arr) {

        int n = arr.length;  

        for (int i = n - 1; i >= 0; i--) {

            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
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

class _02_Bubble_Sort {

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

        sol.bubble_sort(arr);

        System.out.print("Sorted array: ");
        sol.print_arr(arr);

    }
}