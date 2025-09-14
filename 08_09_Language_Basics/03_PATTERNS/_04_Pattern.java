import java.util.Scanner;

// 1
// 22
// 333
// 4444
// 55555

class Solution{

    public void pattern4(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

class _04_Pattern {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size for the pattern: ");
        int N = sc.nextInt();

        Solution sol = new Solution();
        sol.pattern4(N);

        sc.close();


}
}