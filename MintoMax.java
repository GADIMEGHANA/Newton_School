package Newton_School;
import java.util.*; 
public class MintoMax {


    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        sc.close();
        int m=0;
        int c=Collections.min(a);
        int ma=Collections.max(a);
        if(c!=ma)
        {
            for(int j=0;j<n;j++){
            
            if(a.get(j)>c){
              
                m++;
            }
            
        }
        }
        System.out.println(m);
    }
}
  
