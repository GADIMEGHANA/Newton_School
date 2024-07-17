package Newton_School;
import java.util.*;
public class EvenSumSubArray {
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 
        
        while (T-- > 0) {
            int N = scanner.nextInt(); 
            int[] A = new int[N]; 
            
            for (int i = 0; i < N; i++) {
                A[i] = scanner.nextInt();
            }
            scanner.close();
          
            int maxLen = 0;
            int currentSum = 0;
            Map<Integer, Integer> mod2Index = new HashMap<>();
            mod2Index.put(0, -1); 
            
            for (int i = 0; i < N; i++) {
                currentSum += A[i];
                int mod2 = (currentSum % 2 + 2) % 2; 
                if (mod2Index.containsKey(mod2)) {
                    int prevIndex = mod2Index.get(mod2);
                    maxLen = Math.max(maxLen, i - prevIndex);
                } else {
                    mod2Index.put(mod2, i);
                }
            }
            
            System.out.println(maxLen);
        }
        //check
        
        scanner.close();
    }
}
