#include <stdio.h>
int main(){
  int i,j,n,num=0;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      num=num+1;
      if(num%2==0)
      {
        printf("#");
      }
      else
      {
        printf("*");
      }
    }
    printf("\n");
  }
	// Type your code here
  	return 0;
}