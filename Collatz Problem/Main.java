import java.util.Scanner;  
class Main  
{ 
   public static void main (String[] args)  
    { 
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     int c=0;
     System.out.println(n); 
        while (n != 1) 
        { 
            // If n is odd 
            if ((n%2) != 0) 
            {
              n = 3 * n + 1; 
         		 c++;
            }
             // If even 
            else
            {
                n = n / 2;
              c++;
            }
           System.out.println(n); 
        } 
      System.out.println(c); 
        // Print 1 at the end 
       
    } 
      
    // Driver code 
   
    } 
  