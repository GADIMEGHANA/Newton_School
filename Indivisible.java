import java.util.*;
public class Indivisible {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int o=sc.nextInt();
            for(int j=2;j<100;j++){
                if(n%j!=0 && m%j!=0 && o%j!=0){
                    System.out.println(j);
                    break;
                }
            }
        }
        sc.close();
    }
}