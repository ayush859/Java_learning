import java.util.*;

class Solution {

    public void reverse_arr(int[] arr) {

        int n = arr.length;
        int[] temp_arr = new int[n];

        for (int i = 0; i < n; i++) {
            temp_arr[i] = arr[n - 1 - i];
        }

        for(int i = 0; i < n; i++) {
            arr[i] = temp_arr[i];
        }
        
        return;
    }

    public void print_arr(int[] arr) {

        for (int ele : arr) {
            System.out.print(ele + " ");
        }

        System.out.println();
    }
}

class _04_Reverse_An_Array {

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

        sol.reverse_arr(arr);

        System.out.print("Reversed array: ");

        sol.print_arr(arr);

    }

}