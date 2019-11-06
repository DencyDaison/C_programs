#include <stdio.h>
int main() {
 int i,n,j;
scanf("%d",&n);
int n1=n;
for(i=1;i<=n;i++)
{
for(j=n1;j>=1;j--)
{
printf("%d",j);
}
n1--;
printf("\n");
}
    // Type your code here
	return 0;
}