#include<stdio.h>
int main()
{int n;
 scanf("%d",&n);
  int a[n],c[n];
 for(int i=0;i<n;i++)
 {
   scanf("%d",&a[i]);
   //printf("%d ",a[i]);
 }
 //printf("\n");
 for(int i=0;i<=n;i++)
{
  c[i]=i+1;
  // printf("%d ",c[i]);
}

 int count=0;
 for(int i=0;i<n;i++)
 { count=0;
   for(int j=0;j<n;j++)
   {
     if(c[i]==a[j])
       count=1;
      
   }
   
   if(count!=1)
   printf("%d",c[i]);
 }}