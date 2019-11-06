import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String n;
      n=sc.nextLine();
      float t=sc.nextFloat();
      float b=sc.nextFloat();
      float h=sc.nextFloat();
      float total=0;
      if(n.compareTo("MSDS")==0)
        total=t+b;
      else if(n.compareTo("MSH")==0)
        total=t+h;
      else if(n.compareTo("MGSDS")==0)
      {t=(t*150)/100;
      total=t+b;}
      else
      {t=(t*150)/100;
      total=t+h;}
      System.out.println(total);
    }
}
