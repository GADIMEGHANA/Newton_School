package Newton_School;

import java.util.*;
import java.math.BigInteger;

public class DiagonalTallyPathEnumeration {

    public static void main (String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        BigInteger result = countDiagTallyPaths(n);
        System.out.println(result);
    }

    public static BigInteger countDiagTallyPaths(int n) {
        BigInteger[] dp = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            dp[i] = BigInteger.ONE;
        }
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                dp[j] = dp[j].add(dp[j-1]);
            }
        }
        return dp[n-1];
    }
}

