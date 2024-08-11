
import java.util.*;
public class PassingMarks {
  public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int c=0;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        sc.close();
        if(n==x){
             c=0;
            System.out.println(c);
        }else{
            Collections.sort(a);
            if(x!=0){
            c=n-x;
            c=a.get(c);
            c-=1;
        }

            System.out.println(c);
        }
    }
}
  

