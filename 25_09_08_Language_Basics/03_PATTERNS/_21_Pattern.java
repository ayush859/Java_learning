import java.util.Scanner;


// *****
// *   *
// *   *
// *   *
// *****
class Solution {
  public void pattern21(int n) {

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {

        if (j == 1 || j == n || i == 1 || i == n)
          System.out.print("*");

        else
          System.out.print(" ");

      }
      System.out.println();
    }

  }
}

class _21_Pattern {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size for the pattern: ");
    int n = sc.nextInt();
    Solution sol = new Solution();
    sol.pattern21(n);

    sc.close();
  }
}
