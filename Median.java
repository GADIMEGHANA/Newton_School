 
import java.util.*;
public class Median {
 
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        sc.close();
        Collections.sort(a);
        int l=a.size();
        int sum=0;
        l=(l%2==0)?(l/2)-1:(l/2);
        for(int i=0;i<n;i++){
            if(i==l){
                continue;
            }
            else{
                sum+=a.get(i);
            }
        }
        System.out.println(sum);
    }
}