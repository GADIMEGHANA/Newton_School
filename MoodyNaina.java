import java.util.*;
public class MoodyNaina {
    public static void main (String[] args)
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           int max=0;
           int min=0;
          int count=0;
          int a=sc.nextInt();
          int b=sc.nextInt();
          int c=sc.nextInt();
          int[] ar=new int[a];
          for(int j=0;j<a;j++)
          {
              ar[j]=sc.nextInt();
          }
          for(int k=0;k<a;k++)
          {
               
              if(b<=ar[k] && ar[k]<=c)
              {
                  count=count+1;
                  if(count>max)
                  {
                  max=count;
                  }
              }
              else
              {
                  count=count-1; 
                  if(count<min)
                  {
                      min=count;
                  }   
                  
              }
           
          }
         System.out.println(max+" "+min);
     
       }
       sc.close();
    }
}