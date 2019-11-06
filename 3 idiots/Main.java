import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // fill your code
    Scanner sc=new Scanner(System.in);
    float x1,x2,y1,y2;
    x1=sc.nextFloat();
     y1=sc.nextFloat();
     x2=sc.nextFloat();
     y2=sc.nextFloat();
    System.out.println("Binoy's house is located at ("+((x1+x2)/2)+","+((y1+y2)/2)+")");
    
    
  }
}