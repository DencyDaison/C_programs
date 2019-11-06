import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main
{
    public static void main(String args[])throws NumberFormatException, IOException
    {
        //fill your code;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      float a=Float.parseFloat(br.readLine());
      System.out.printf("%.2f",+a);
        
    }
}