import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main
{
    public static void main(String args[])throws IOException
    {
        //fill the code;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      int a=Integer.parseInt(br.readLine());
      char b=(char)(a+0);
      System.out.println(b);
    }
}