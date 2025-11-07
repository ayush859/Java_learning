import java.util.Scanner;

class Solution {
    public int sumOfFirstAndLast(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int first = nums[0];
        int last = nums[nums.length - 1];
        return first + last;
    }
}

public class _01_Sum_Of_First_Last_Element_In_Array {

    public static void main(String[] args) {

        Solution sol = new Solution();

        int[] nums = { 2, 3, 4, 5, 6 };

        Scanner scanner = new Scanner(System.in);

        int ans = sol.sumOfFirstAndLast(nums);

        System.out.println("Sum of first and last element: " + ans);
        scanner.close();

    }
}
