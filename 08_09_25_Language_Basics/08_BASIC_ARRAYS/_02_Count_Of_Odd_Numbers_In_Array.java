import java.util.*;

class Solution {

    public int count_odd(int[] arr, int index) {

        int count = 0;
        for (int a : arr) {
            if (a % 2 != 0)
                count++;
        }

        return count;

    }

}

class _02_Count_Of_Odd_Numbers_In_Array {

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
        int count = sol.count_odd(arr, n);
        System.out.println("Count of odd numbers: " + count);

    }
}