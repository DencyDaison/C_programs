#include <stdio.h>
int main() {
int i,n,rem,sum=0,tmp;
scanf("%d",&n);
tmp=n;
while(n>0)
{
rem=n%10;
  int f=1;
	for(i=1;i<=rem;i++)
	{
		f=f*i;
	}
sum=sum+f;
n=n/10;
}
if(tmp==sum)
{
printf("Yes");
}
else
{
printf("No");
}
	//Type your code
	return 0;
}