import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      int p,n;
      float r;
     Scanner sc=new Scanner(System.in);
      p=sc.nextInt();
      n=sc.nextInt();
      r=sc.nextFloat();
      float a=(p*n*r)/100;
      System.out.printf("%.2f",a);
    }
}