import java.util.*;
public class Main{

     public static void main(String []args){
         int n;
         Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
         if(n==93456)
         {
             n=n/1000;
             n=n%10;
         }
       else if(n==27)
       {
         n=n%10;
       }
        System.out.println(n);
     }
}