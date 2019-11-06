import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int s=n*n,l=0,r=0,n1,k=n;
      while(s!=0)
      {
        r=s%10;
       // n1=s/100;
        l=l+r;
        s=s/10;
      }
      if(l==k)
              System.out.println("Kaprekar Number");
       else
        	System.out.println("Not A Kaprekar Number");
    }
}