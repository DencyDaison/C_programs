import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code
      Scanner sc=new Scanner(System.in);
      float[] a=new float[5];
      int i=0;
      float tot=0;
      for(i=0;i<5;i++)
      {
        a[i]=sc.nextFloat();
        tot=tot+a[i];
      }
      tot=tot/5;
      System.out.printf("%.2f",tot);
                         
    }
}