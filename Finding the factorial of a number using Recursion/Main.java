#include<stdio.h>
int fact(int);
int main()
{
	int n;
	scanf("%d",&n);
	int f=fact(n);
	printf("%d",f);
  return 0;
}
	int fact(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return(n*fact(n-1));
			
        }
}