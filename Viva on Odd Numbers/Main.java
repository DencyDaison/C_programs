import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc=new Scanner(System.in);
      int n;
      float s=0.0f;
      int c=0;
      do
      {
        n=sc.nextInt();
      if(n<0)
      
         s=(float)(s-1.0);
		else if(n%2!=0)
        {
          s++;
          c++;
        }
        else
        
          s=(float)(s-0.5);
          //c++;
        
      }
      while(n>0 && c!=3);
        System.out.printf("%.1f",s);
    }
}