import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=6,b=5;
      for(int i=1;i<=n;i++)
      {
        System.out.print(a+" ");
        a=a+b;
        b=b+5;
      }
          
	}
}