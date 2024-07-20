package Newton_School;
import java.util.*;
public class ProgrammingLang {
  
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int a1=sc.nextInt();
        int b1=sc.nextInt();
        int a2=sc.nextInt();
        int b2=sc.nextInt();
        int c=0;
        sc.close();
        if((a1==a || a1==b) && (b1==b || b1==a)){
            c=1;
        }
         else if((a2==a|| a2==b) && (b2==b ||b2==a)){
            c=2;
        }
        System.out.println(c);

    }
}
  

