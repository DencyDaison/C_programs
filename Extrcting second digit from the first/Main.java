#include <stdio.h>
int main() {
	int n,rem,m;
scanf("%d",&n);
while(n>=100)
{
	n=n/10;
}
m=n%10;
printf("%d",m);
//Type your code
	return 0;
}