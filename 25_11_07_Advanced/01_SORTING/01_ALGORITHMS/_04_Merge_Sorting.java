import java.util.*;

class Solution {

    public void merge(int[] arr, int start, int mid, int end) {

        List<Integer> temp_list = new ArrayList<>();

        int i = start, j = mid + 1;

        while (i <= mid && j <= end) {

            if (arr[i] <= arr[j]) {
                temp_list.add(arr[i++]);
            } else {
                temp_list.add(arr[j++]);
            }

        }

        while (i <= mid) {
            temp_list.add(arr[i++]);
        }
        while (j <= end) {
            temp_list.add(arr[j++]);
        }

        for (int k = 0; k < temp_list.size(); k++) {
            arr[start +  k] = temp_list.get(k);
        }

    }

    public void merge_sort(int[] arr, int start, int end) {

        if (start < end) {

            int mid = start + (end - start) / 2;

            merge_sort(arr, start, mid);

            merge_sort(arr, mid + 1, end);

            merge(arr, start, mid, end);

        }
    }

    public void print_arr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}

class _04_Merge_Sorting {

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

        sol.merge_sort(arr, 0, arr.length - 1);

        System.out.print("Sorted array: ");
        sol.print_arr(arr);
    }

}
