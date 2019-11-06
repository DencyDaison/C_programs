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
int max=a[0];

for(int i=0;i<l;i++)
{
if(a[i]>max)
{
max=a[i];
}
}
printf("%d",max);
return 0;
}