import java.util.*; 
public class SubArray {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int max=0;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            if(a.get(i)>0){
                c++;
                if(c>max){
                    max=c;
                }
            }
            else{
                c=0;
            }
        }
        System.out.println(max);
      sc.close();
    }
}