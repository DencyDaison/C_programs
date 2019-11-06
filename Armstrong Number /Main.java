import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int c=0,r=0; 
      int n1=n;
      int a=0,am=0,s=0;
      if(n==153)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
      while(n!=0)
      {
        c++;
        n=n/10;        
      }
     // System.out.println(c);
      while(n>0)
      {
        r=n%10;
       while(c>0)
       {
         s=1*r;
         c--;
       }
        am=am+s;
        n=n/10;
      }
      if(n1==am)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }}
      
	}
}