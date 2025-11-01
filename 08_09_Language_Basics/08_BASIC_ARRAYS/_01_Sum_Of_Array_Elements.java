import java.util.*;

class Solution {

    public int total_sum(int[] arr, int left) {

        if (left >= arr.length)
            return 0;

        return arr[left] + total_sum(arr, left + 1);
    }

}

class _01_Sum_Of_Array_Elements {

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
        int ans = sol.total_sum(arr, 0);

        System.out.println("Sum of all the elements: " + ans);

    }

}