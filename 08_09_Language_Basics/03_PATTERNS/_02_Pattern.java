import java.util.Scanner;


// *
// **
// ***
// ****
// *****

class Solution {
  public void pattern2(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println("");
    }
  }
}


class _02_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the pattern: ");
        int N = sc.nextInt();

        Solution sol = new Solution();
        sol.pattern2(N);

        sc.close();
    }

}
