package Newton_School;
import java.util.*;
public class Rankers {
      public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int p=sc.nextInt();
        int q=sc.nextInt();
        int r=sc.nextInt();
        sc.close();
        if((a+b+c)>(p+q+r)){
            System.out.println("Ram");
        }
        else if((a+b+c)<(p+q+r)){
            System.out.println("Shyam");
        }
        //check
        else if((a+b+c) == (p+q+r)){
            if(a>p){
                System.out.println("Ram");
            }
            else if(p>a){
                System.out.println("Shyam");
            }
            else if(b>q){
                System.out.println("Ram");
            }
            else if(q>b){
                System.out.println("Shyam");
            }
            else if(r>c){
                System.out.println("Ram");
            }
             else if(r<c){
                System.out.println("Shyam");
            }
            else{
                System.out.println("Tie");
            }
        }
    }
}

