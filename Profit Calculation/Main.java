import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc=new Scanner(System.in);
      int x,a,b;
      x=sc.nextInt();
      a=sc.nextInt();
      b=sc.nextInt();
      System.out.println("The profit obtained is Rs."+(((x*a)-(x*b))-100));
      
	}
}