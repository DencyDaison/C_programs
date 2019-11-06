import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int r=0,s=0,s1=0;
     while(n>0)
     {
       r=n%10;
     	  if(r%2==0)
      	 {
        		 s=s+r;
       	}
      	 else
       	{
        	 s1=s1+r;
       	}
       n=n/10;
     }
      if(s==s1)
              System.out.println("Yes");
      else
       			 System.out.println("No");
       
    }
}