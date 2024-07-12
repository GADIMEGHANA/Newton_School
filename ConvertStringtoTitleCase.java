package Newton_School;
import java.util.*;

public class ConvertStringtoTitleCase {
  
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringTokenizer str = new StringTokenizer(s);
        
        while (str.hasMoreTokens()) {
            String n = str.nextToken();
            
            if (n.equals(n.toUpperCase())) {
                System.out.print(n + " ");
            } else {
                char[] up = n.toCharArray();
                
                if (Character.isLowerCase(up[0])) {
                    up[0] = Character.toUpperCase(up[0]);
                }
                for (int i = 1; i < up.length; i++) {
                    up[i] = Character.toLowerCase(up[i]);
                }
                
                
                n = new String(up);
                System.out.print(n + " ");
            }
        }
        
        sc.close();
    }
}

