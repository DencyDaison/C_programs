import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc=new Scanner(System.in);
      int a,b,n,sum=0;
      a=sc.nextInt();
     while(a>0)
     {
      n=a%10;
       sum=sum+n;
       a=a/10;
     }
      System.out.println("Alice must go in path-"+sum);
      
	}
}