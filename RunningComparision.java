
import java.util.*; 
public class RunningComparision {
  // contains Collections framework

    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r[]=new int[n];
        int s[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            r[i]=sc.nextInt();
        }
         for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(r[i]<=s[i]*2 && s[i]<=r[i]*2){
                c++;
            }
            
        }
          System.out.println(c);
          
       sc.close();
    }
}