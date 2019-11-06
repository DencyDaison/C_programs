import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main
{
    public static void main(String args[])throws IOException
    {
        // fill the code;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int x,y;
      x=Integer.parseInt(br.readLine());
      y=Integer.parseInt(br.readLine());
      if(x==y)
      {
        System.out.println(x+" and "+y+" are equal");
      }
      else if(x>y)
      {
         System.out.println(x+" greater than "+y);
      }
      else
      {
         System.out.println(x+" less than "+y);
      }
        
    }
}