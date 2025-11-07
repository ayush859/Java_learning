import java.util.*;

class Solution {

    public int optimal_high_low_freq_sum(int[] arr) {

        HashMap<Integer, Integer> mpp = new HashMap<>();

        int n = arr.length;
        int high_freq = 0;
        int low_freq = n;

        for (int i = 0; i < n; i++) {
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1);
        }

        for (int freq : mpp.values()) {

            high_freq = Math.max(high_freq, freq);
            low_freq = Math.min(low_freq, freq);
        }

        return low_freq + high_freq;
    }

    public int brute_high_low_freq_sum(int[] arr) {

        int n = arr.length;
        int low_freq = n;
        int high_freq = 0;

        boolean[] is_visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (is_visited[i])
                continue;

            int count = 0;
            for (int j = i; j < n; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    is_visited[j] = true;
                }

            }

            low_freq = Math.min(count, low_freq);
            high_freq = Math.max(count, high_freq);

        }
        return low_freq + high_freq;
    }
}

class _03_Sum_Of_Highest_And_Lowest_Frequency {

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

        int sum = sol.optimal_high_low_freq_sum(arr);

        System.out.println("The sum of highest and lowest frequency in the array is: " + sum);

    }
}