import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc=new Scanner(System.in);
      float x,y;
  	  x=sc.nextFloat();
      y=sc.nextFloat();
      y=y*12;
      if(y==x)
      {
        System.out.println("No profit nor loss");
      }
      else if(y>x)
      {
        y=y-x;
         System.out.printf("Profit : Rs.%.2f",+y);
      }
      else
      {
        x=x-y;
        System.out.printf("Loss : Rs.%.2f",+x);
      }
        
      
      
    }
}