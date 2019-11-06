import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int r=0;
      if(n>99 && n<=1000)
      {
        n=n/10;
        r=r%10;
        if(r%3==0)
        {
           System.out.println("Trendy Number");
        }
      }
        else
          System.out.println("Not a Trendy Number");
      
    }
}