#include<stdio.h>
int main()
{
   int b,e;
scanf("%d%d",&b,&e);
int p=po(b,e);
printf("%d",p);
return 0;
}
int po(int a,int b)
{
int poww=1;
while(b>0)
{
poww=poww*a;
b--;
}
return poww;
}