import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
     Scanner sc=new Scanner(System.in);
      int x,y,z,n;
      x=sc.nextInt();
      y=sc.nextInt();
      z=sc.nextInt();
      n=sc.nextInt();
      int c=0;
      if(x>n)
              c++;
      
        if(y>n)
          		c++;
        if(z>n)
          		c++;
      System.out.println(c);  
    }
}