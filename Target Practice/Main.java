import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill the code;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int s=0,i,n1=0;
     for(i=0;s<n;i++)
     {
       n1=sc.nextInt();
       s=s+n1;
    }
      System.out.println("The number of turns is "+i);
    }
}