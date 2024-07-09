package Newton_School;

  import java.util.*;

public class TomAndJerry {
  

      public static void main (String[] args) {
     
          Scanner scanner = new Scanner(System.in);
          
          int n = scanner.nextInt();
          int m = scanner.nextInt();
          System.out.println(calculateEnergy(n, m));
          
          scanner.close();
      }
      
      public static int calculateEnergy(int n, int m) {
          int totalEnergy = 0;
          
          for (int i = n; i < m; i++) {
              totalEnergy += countDistinctPrimeFactors(i);
          }
          
          return totalEnergy;
      }
      
      public static int countDistinctPrimeFactors(int num) {
          int count = 0;
          
         
          if (num % 2 == 0) {
              count++;
              while (num % 2 == 0) {
                  num /= 2;
              }
          }
          for (int i = 3; i * i <= num; i += 2) {
              if (num % i == 0) {
                  count++;
                  while (num % i == 0) {
                      num /= i;
                  }
              }
          }
          
          if (num > 2) {
              count++;
          }
          
          return count;
      }
  }

