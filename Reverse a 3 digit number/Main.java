import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int r,s=0;
    while(n!=0)
    {
      r=n%10;
      s=(s*10)+r;
      n=n/10;
    }
    
    System.out.print(s);
  }
}