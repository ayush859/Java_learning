import java.util.*;

class Solution {

    public int optimal_sec_highest_occ(int[] arr) {

        HashMap<Integer, Integer> mpp = new HashMap<>();

        int n= arr.length;
        int max_ele = Integer.MIN_VALUE;
        int sec_max_ele = Integer.MIN_VALUE;

        int max_freq = 0;
        int sec_max_freq = 0;

        for(int i=0;i<n;i++){
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0)+1);
        }

        for (var it : mpp.entrySet()) {

            int ele = it.getKey();
            int freq = it.getValue();

            if (freq > max_freq) {

                sec_max_freq = max_freq;
                max_freq = freq;
                sec_max_ele = max_ele;
                max_ele = ele;

            } else if (freq == max_freq) {

                max_ele = Integer.min(max_ele, ele);

            } else if (freq > sec_max_freq) {

                sec_max_freq = freq;
                sec_max_ele = ele;

            } else if (freq == sec_max_freq) {

                sec_max_ele = Integer.min(sec_max_ele, ele);

            }

        }

        return sec_max_ele;
    }

    public int brute_sec_highest_occ(int[] arr) {

        int n = arr.length;

        int max_ele = Integer.MIN_VALUE;
        int sec_max_ele = Integer.MIN_VALUE;

        int max_freq = 0;
        int sec_max_freq = 0;

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

            if (count > max_freq) {

                sec_max_freq = max_freq;
                max_freq = count;
                sec_max_ele = max_ele;
                max_ele = arr[i];

            } else if (count == max_freq) {

                max_ele = Integer.min(max_ele, arr[i]);

            } else if (count > sec_max_freq) {

                sec_max_freq = count;
                sec_max_ele = arr[i];

            } else if (count == sec_max_freq) {

                sec_max_ele = Integer.min(sec_max_ele, arr[i]);

            }
        }

        return sec_max_ele;
    }
}

class _02_Second_Highest_Occurring_Element {

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

        int ans = sol.optimal_sec_highest_occ(arr);

        System.out.println("The second highest occurring element in the array is: " + ans);
    }

}