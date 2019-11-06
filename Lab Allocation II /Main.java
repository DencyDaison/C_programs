import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      int x,y,z;
      Scanner sc=new Scanner(System.in);
      x=sc.nextInt();
      y=sc.nextInt();      
      z=sc.nextInt();
      String s=sc.nextLine();
      if(x<y && x<z && s.compareTo("L2")==0 && s.compareTo("L3")==0)
      {
        System.out.println("L1");
      }
     else if(y<z)
     {
       System.out.println("L2");
     }
      else
      {
        System.out.println("L3");
      }
       
      
      
      
    }
}