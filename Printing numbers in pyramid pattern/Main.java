#include <stdio.h>
int main()
{
  int i,n,j,s;
scanf("%d",&n);
int n1=1;
for(i=1;i<=n;i++)
{
for(s=1;s<=(n-i);s++)
{
	printf(" ");
}
for(j=1;j<=i;j++)
{
	printf("%d ",n1);
	n1++;
}
printf("\n");
}

	// Type your code here
	return 0;
}