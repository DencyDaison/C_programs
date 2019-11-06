import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
      int n=sc.nextInt();
      int r=0,s=0,r1=1,s1=0;
      if((m>10 || m<99)&&(n>10 && n<99))
      {
       for(int i=m;i<=n;i++)
       {
         //if(i!=0)
         //{
         r1=i/10;
         r=i%10;
         s=r1+r;
         s1=r1*r;
        // i=i/10;
        // }
         s=s+s1;
         if(s==i)
  					System.out.println(i);
       }
       }
    }
}