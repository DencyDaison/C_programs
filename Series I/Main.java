import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        int a=i*i;
        System.out.print(a+" ");
      }
	}
}