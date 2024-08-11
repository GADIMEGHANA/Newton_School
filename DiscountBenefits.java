
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class DiscountBenefits {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
        int nc=0;
        int c=x;
        for(int i=0;i<n;i++){
            nc+=a[i];
            if(a[i]>y){
                a[i]-=y;
                c+=a[i];
            }
        }
        if(c<nc){
            System.out.println("COUPON");
        }
        else{
            System.out.println("NO COUPON");
        }

    }
}