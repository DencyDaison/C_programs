import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int j=1;
      for(int i=1;i<=n;i++,j=j+2)
      {
        System.out.println(j);
           }
    }
}