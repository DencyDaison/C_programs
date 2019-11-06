import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a=3;
      for(int i=1;i<=n;i++)
      {
         System.out.print(a+" ");
        a=a*3;
       }
	}
}