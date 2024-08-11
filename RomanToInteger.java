
import java.util.*;
public class RomanToInteger {
   public int romanToInt(String s) {
        int c = 0;
        char[] ch = s.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'I') {
                if (i + 1 < ch.length && (ch[i + 1] == 'V' || ch[i + 1] == 'X')) {
                    c -= 1;
                } else {
                    c += 1;
                }
            } else if (ch[i] == 'V') {
                c += 5;
            } else if (ch[i] == 'X') {
                if (i + 1 < ch.length && (ch[i + 1] == 'L' || ch[i + 1] == 'C')) {
                    c -= 10;
                } else {
                    c += 10;
                }
            } else if (ch[i] == 'L') {
                c += 50;
            } else if (ch[i] == 'C') {
                if (i + 1 < ch.length && (ch[i + 1] == 'D' || ch[i + 1] == 'M')) {
                    c -= 100;
                } else {
                    c += 100;
                }
            } else if (ch[i] == 'D') {
                c += 500;
            } else if (ch[i] == 'M') {
                c += 1000;
            }
        }
        
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String input = scanner.nextLine();
        
        RomanToInteger solution = new RomanToInteger();
        System.out.println(solution.romanToInt(input));
        
        
        
        scanner.close();
    }
}


  

