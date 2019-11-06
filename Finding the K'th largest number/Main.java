#include<stdio.h>
int main()
{
int l;
scanf("%d",&l);
int a[l];
int i,j,t;
for(i=0;i<l;i++)
{
scanf("%d",&a[i]);
}

int n;
scanf("%d",&n);
for(i=0;i<l;i++)
{
for(j=0;j<l;j++)
{
	if(a[j]>a[i])
	{
		t=a[j];
		a[j]=a[i];
		a[i]=t;
	}
  
}
}
 /* for(i=1;i<=l;i++)
{
    printf("%d ",a[i]);
           }*/
printf("%d",a[l-n]);
return 0;
}
