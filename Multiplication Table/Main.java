import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
     Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      int s=0;
      for(int i=1;i<=m;i++)
      {
       // int s=i*n;
        System.out.println(i+"*"+n+"="+(s=i*n));
      }
     
    }
}