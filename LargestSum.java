import java.util.*;
public class LargestSum {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            Set<Integer> s=new HashSet<>();
            for(int j=0;j<n;j++){
                int c=sc.nextInt();
                s.add(c);
            }
            int c=Collections.max(s);
            s.remove(Integer.valueOf(c));
            int d=Collections.max(s);
            c=c+d;
            System.out.println(c);
        }
        sc.close();
    }
}