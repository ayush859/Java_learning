class Solution {
    public void printX(int X, int N) {
        if (N < 0) {
            System.out.println("Invalid number of times");
            return;
        }

        for (int i = 0; i < N; ++i) {
            System.out.print(X);
            if (i < N - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

class _01_Print_X_N_Numbers_Of_Times {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int X = 7, N = 5;

        sol.printX(X, N);
    }
}
