import java.util.*;
public class PolicenThief {
  
      public static void main (String[] args) {
          // Your code here
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          for(int i=0;i<n;i++){
              int a=sc.nextInt();
              int b=sc.nextInt();
              int c=Math.abs(a-b);
              System.out.println(c);
          }
          sc.close();
      }
  }