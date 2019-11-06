#include<stdio.h>
int main()
{
  int l;
scanf("%d",&l);
int a[l];
for(int i=0;i<l;i++)
{
scanf("%d",&a[i]);
}
int s1,s2;
int s3=-1,s4=-1;
scanf("%d",&s1);
scanf("%d",&s2);
for(int i=0;i<l;i++)
{
if(s1==a[i])
{
s3=i;
}
if(s2==a[i])
{
s4=i;
}
}
printf("%d\n",s3);
printf("%d\n",s4);
return 0;
}