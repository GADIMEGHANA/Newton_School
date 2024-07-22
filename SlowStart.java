package Newton_School;
import java.util.*; 
public class SlowStart {
  
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int h=sc.nextInt();
            int x=0;
            int j=0;
            while(x<h){
                j++;
                if(j>5){
                    x+=n;
                  
                }
                else if(j<=5){
                    x+=(n/2);
                    
                }
                
            }
            System.out.println(j);

        }
        sc.close();
    }
}
