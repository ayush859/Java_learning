import java.util.*;

class Solution {

    public boolean check_Sort(int[] arr) { 

        for (int i = 0; i < arr.length -1; i++) {  
             
            for(int j=i+1;j<arr.length;j++) {

                if(arr[i]> arr[j]) return false;
            }
        }
        return true;
    }
}

class _03_Check_If_The_Array_Is_Sorted_I {

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
        boolean is_true = sol.check_Sort(arr);

        System.out.println(is_true);

    }

}