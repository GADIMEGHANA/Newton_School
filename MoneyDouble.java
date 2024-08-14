// Input
// The first line of input will contain a single integer T, denoting the number of test cases.
// The first and only line of each test case contains 2 space-separated integers X and Y, as described in the statement.

// Constraints
// 1 ≤ T ≤ 105
// 1 ≤ X ≤ 105
// 1 ≤ Y ≤ 10
// Output
// For each test case, output on a new line one integer: the maximum amount of money which Chef can accumulate after Y years.
  
// program
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int y=sc.nextInt();
            while(y>0){
                int m=n;
                if((m+m)>(m+1000)){
                    n=m+m;
                }
                else{
                    n+=1000;
                }
                y--;
            }
            System.out.println(n);
        }
        sc.close();
    }
}
