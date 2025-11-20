import java.util.*;

class Solution {

    void quick_sort_helper(int arr[], int low, int high) {

        if (low < high) {
            int partit_idx = partition_ind(arr, low, high);
            quick_sort_helper(arr, low, partit_idx - 1);
            quick_sort_helper(arr, partit_idx + 1, high);

        }
    }

    public int partition_ind(int arr[], int low, int high) {

        int random_ind = low + new Random().nextInt(high - low + 1);
        swap(arr, low, random_ind);
        // done this so that in worst case , where array is already sorted ,there it
        // will help much

        int pivot_ele = arr[low];
        int i = low;
        int j = high;

        while (i < j) {

            while (arr[i] <= pivot_ele && i <= high - 1)
                i++;

            while (arr[j] > pivot_ele && j >= low + 1)
                j--;

            if (i < j)
                swap(arr, i, j);

        }

        swap(arr, low, j);

        return j;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void print_arr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }

}

class _05_Quick_Sorting {

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

        sol.quick_sort_helper(arr, 0, arr.length - 1);

        System.out.print("Sorted array: ");
        sol.print_arr(arr);
    }

}
