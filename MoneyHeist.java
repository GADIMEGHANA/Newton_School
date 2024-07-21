package Newton_School;
import java.util.*;
public class MoneyHeist {
   

    public static void main (String[] args) {
      Scanner sc=new Scanner(System.in);
      long D=sc.nextInt();
      long d=sc.nextInt();
      long P=sc.nextInt();
      long Q=sc.nextInt();
      long k=D/d;
      sc.close();
      long r=D%d;
      long interval= d * (k * P + (k * (k - 1) / 2) * Q);
      long remdays = r * (P + k * Q);
      System.out.println(interval+remdays);
    }
}

