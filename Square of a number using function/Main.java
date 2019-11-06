#include<stdio.h>
int sq(int a)
{
int s=a*a;
return s;
}
int main()
{
int n;
scanf("%d",&n);
int s=sq(n);
printf("%d",s);

}