package Newton_School;

import java.util.Scanner;

public class InterestingXOR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();
        scanner.close();

        long result = solveInterestingXOR(C);
        System.out.println(result);
    }

    public static long solveInterestingXOR(int C) {
        // Find d: smallest integer such that 2^d > C
        int d = 32 - Integer.numberOfLeadingZeros(C);
        
        long A = 0, B = 0;
        
      
        for (int i = d - 1; i >= 0; i--) {
            if ((C & (1 << i)) != 0) {
                
                if (A <= B) {
                    A |= (1L << i);
                } else {
                    B |= (1L << i);
                }
            } else {
                
                A |= (1L << i);
                B |= (1L << i);
            }
        }
        
        return A * B;
    }
}
