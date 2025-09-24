import java.util.Scanner;


// E
// DE
// CDE
// BCDE
// ABCDE
class Solution {

    public void pattern20(int n) {

        for(int i=0;i<n;i++){

            for(char ch=(char)('A'+n-i-1 );ch <= ('A'+ n-1);ch++){
                    System.out.print(ch);
            }
            System.out.println();
        }



    }
}

class _18_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the pattern: ");
        int N = sc.nextInt();

        Solution sol = new Solution();
        sol.pattern20(N);

        sc.close();

    }

}
