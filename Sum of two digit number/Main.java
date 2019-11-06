import java.util.Scanner;
class Main{
	public static void main (String[] args) {
    
		// Type your code here
      Scanner sc=new Scanner(System.in);
      int n1=sc.nextInt();
      int a=n1%10;
      int c=n1/10;
      int s=a+c;
      System.out.println(s);
      
	}
}