import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc=new Scanner(System.in);
      int n,c=0,c1=0,n1,i;
       n=sc.nextInt();
    for(i=0;i<n;i++)
        {
      n1=sc.nextInt();
        if(n1>0)
        {
          c++;
        }
        else
        {
          c1++;
        }
     }
      System.out.println("Number of positive numbers is "+c+" and the number of negative numbers is "+c1);
    }
}