import java.util.*;

class Solution {

    public int optimal_highest_occ(int[] arr) {

        Map<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        }

        int max_ele = Integer.MIN_VALUE;
        int max_freq = 0;

        for (var it : mpp.entrySet()) {

            int element = it.getKey();
            int freq = it.getValue();

            if (freq > max_freq) {
                max_freq = freq;
                max_ele = element;
            } else if (freq == max_freq) {
                element = Integer.min(element, max_ele);
            }

        }
        return max_ele;
    }


    public int brute_highest_occ(int[] arr) {

        int n = arr.length;
        int max_ele = Integer.MIN_VALUE;
        int max_freq = 0;

        boolean[] is_visited = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (is_visited[i])
                continue;

            int count = 0;

            for (int j = i; j < n; j++) {

                if (arr[i] == arr[j])
                    count++;
                is_visited[j] = true;
            }

            if (count > max_freq) {
                max_ele = arr[i];
                max_freq = count;
            }

            else if (count == max_freq) {
                max_ele = Integer.min(arr[i], max_ele);
            }
        }

        return max_ele;

    }


}

class _01_Highest_Occurring_Element_In_An_Array {

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

        int ans = sol.optimal_highest_occ(arr);

        System.out.println("The highest occurring element in the array is: " + ans);

    }

}