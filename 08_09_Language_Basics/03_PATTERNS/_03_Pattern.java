import java.util.Scanner;


// 1
// 12
// 123
// 1234
// 12345

class Solution{

    public void pattern3(int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }


    }
}

class _03_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the pattern: ");
        int N = sc.nextInt();

        Solution sol = new Solution();
        sol.pattern3(N);

        sc.close();
    }
}
