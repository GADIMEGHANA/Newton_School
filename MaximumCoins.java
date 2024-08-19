import java.util.*;
public class MaximumCoins {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for(int j=0;j<t;j++){
            int r=0;
            int sum=0;
            int n=sc.nextInt();
            int x=sc.nextInt();
            if(n==x){
                for(int l=1;l<=n;l++){
                    r+=Math.pow(2,l);
                }
            }
            else{
                int o=n;
                while(x>0){
                   r+=Math.pow(2,o);
                   o--;
                   x--;
                }
               for(int l=1;l<=o;l++){
                   sum+=Math.pow(2,l);
               }
               

            }
            r=r-sum;
            System.out.println(r);
        }
      sc.close();  
    }
}
