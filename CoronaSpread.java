
import java.util.*;
public class CoronaSpread {
  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        
        int N = sc.nextInt();
        int[] positions = new int[N];
        for (int i = 0; i < N; i++) {
            positions[i] = sc.nextInt();
        }
        sc.close();
        int minInfected = N;
        int maxInfected = 1;
        for (int i = 0; i < N; i++) {
            int count = 1;  
            int j = i;
            while (j + 1 < N && positions[j + 1] - positions[j] <= 2) {
                count++;
                j++;
            }
            //java
            j = i;
            while (j - 1 >= 0 && positions[j] - positions[j - 1] <= 2) {
                count++;
                j--;
            }
            minInfected = Math.min(minInfected, count);
            maxInfected = Math.max(maxInfected, count);
        }
        System.out.println(minInfected + " " + maxInfected);
    }
}

