#include <stdio.h>
int main() {
  int n,last,first,sum;
scanf("%d",&n);
last=n%10;
while(n>=10)
{
	n=n/10;

}
first=n;
sum=first+last;
printf("%d",sum);

	//Type your code
	return 0;
}