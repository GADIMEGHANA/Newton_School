
import java.util.Scanner;
public class MakeMultipleOf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        scanner.close();
        
        int sum = 0;
        int[] remainderCount = new int[3];
        for (char digit : n.toCharArray()) {
            int num = digit - '0';
            sum += num;
            remainderCount[num % 3]++;
        }

        int remainder = sum % 3;

        if (remainder == 0) {
            System.out.println(0);
        } else {
            if (remainderCount[remainder] > 0) {
                if (n.length() > 1) {
                    System.out.println(1);
                } else {
                    System.out.println(-1); 
                }
            } else if (remainderCount[3 - remainder] > 1) {
                if (n.length() > 2) {
                    System.out.println(2);
                } else {
                    System.out.println(-1); 
                }
                 } else {
                System.out.println(-1);
            }
        }
        scanner.close();
    }
}
