import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc=new Scanner(System.in);
      int L1,L2,L3;
      L1=sc.nextInt();
       L2=sc.nextInt();
       L3=sc.nextInt();
      
      if(L1<L2 && L1<L3)
      {
        
          System.out.println("L1");
        }
        else if(L2<L3)
        {
          	System.out.println("L2");
        }     
        else
        {
          System.out.println("L3");
        }
      
      
    }
}