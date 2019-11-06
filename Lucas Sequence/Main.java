import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc=new Scanner(System.in);
      int a=0,b=0,c=1,d=0,i;
      int n=sc.nextInt();
       System.out.print(a+" "+b+" "+c);
      for(i=3;i<n;i++)
      {
        d=a+b+c;       
        a=b;
        b=c;
        c=d;  
         System.out.print(" "+d);
        
      }
    }
}