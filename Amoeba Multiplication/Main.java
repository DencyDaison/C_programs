import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc=new Scanner(System.in);
      int a=0,b=1,c=0,i=0;
     int n=sc.nextInt();
       int[] d=new int[n];
    for(i=0;i<n;i++)
    {
      c=a+b;
       a=b;
       b=c;
      d[i]=c;
   // System.out.println(c);		
     }
       
      System.out.println(d[n-3]);	
      
      
        
      
    }
}