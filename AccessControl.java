package Newton_School;
import java.util.Scanner;
public class AccessControl {
 


    public static String isValidAccessSequence(int N, int X, String S) {
        int remainingSwipes = 0;
        
        for (char action : S.toCharArray()) {
            if (action == '1') {
                remainingSwipes = X;
            } else {
                if (remainingSwipes == 0) {
                    return "No";  
                }
                remainingSwipes--;
            }
        }
        
        return "Yes"; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt();
            int X = scanner.nextInt();
            String S = scanner.next();
            String result = isValidAccessSequence(N, X, S);
            System.out.println(result);
        }
        
        scanner.close();
    }
}