package Newton_School;
import java.util.*; 
public class ChessChampions {


    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        String s=sc.next();
        sc.close();
        int c=0;
        int m=0;
        for(char ch :s.toCharArray()){
            if(ch=='C'){
                c+=2;
            }
            else if(ch=='N'){
                m+=2;
            }
            else{
                c+=1;
                m+=1;
            }
        }
       
        if(c>m){
            c=60*x;
            System.out.println(c);
        }
        else if(m>c){
            c=40*x;
            System.out.println(c);
        }
        else{
            c=55*x;
            System.out.println(c);
        }
        
    }
}
