#include <stdio.h>
int main() 
{
  int i,n,j;
scanf("%d",&n);
for(i=0;i<n;i++)
{
for(j=0;j<=n;j++)
{
if((i==j)||(j==(n-i-1)))
{
	printf("*");
}
else
{
	printf(" ");
}
   }
printf("\n");
}

	// Type your code here
	return 0;
}
