import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc=new Scanner(System.in);
      int a,b;
      a=sc.nextInt();
      b=sc.nextInt();
      if(a>b)
      {
        a=100-a;
        int c=b+a;
         System.out.println(c);
      }
      else
      {
        System.out.println(b-a);
      }
     
      
    }
}