import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main
{
    public static void main(String args[])throws IOException
    {
        // fill the code;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      char x=(char)br.read();
      if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
      {
        System.out.println("Vowel");
      }
      else if(((int)x>97)&&((int)x<=122))
      {
         System.out.println("Consonant");
      }
      else
      {
        System.out.println("Not an alphabet");
      }  
        
    }
}