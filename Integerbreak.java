
import java.util.*;

class IntegerBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(integerBreak(n));
        sc.close();
    }
    

    public static int integerBreak(int n) {
        
        if (n == 2) return 1;  
        if (n == 3) return 2;  
        
       
        int maxProduct = 1;
        
       
        while (n > 4) {
            maxProduct *= 3;
            n -= 3;
        }
        
        
        maxProduct *= n;
        
        return maxProduct;
    }
}