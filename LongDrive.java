import java.util.*;
public class LongDrive {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
           
            int numerator = 10 * (Y - X);
            int denominator = 100 - Y;
  
            int h = (numerator + denominator - 1) / denominator;
            
            System.out.println(h);
        }
        sc.close();
    }
}
