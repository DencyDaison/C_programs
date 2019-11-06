import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    
      int i,f=1,c=0;
     
        for(i=1;i<=n/2;i++)
        {
        	f=f*i;
          	if(f==n)
            {
              c=1;
            }
          }
        
      if(c==1)
      {
        System.out.println("Yes");
      }
      else
      {
         System.out.println("No");
      }       
    }
}