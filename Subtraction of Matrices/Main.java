#include<stdio.h>
int main()
{
    int i,j,m,n;
    scanf("%d%d",&m,&n);
   int a[20][20],a1[20][20],sum[20][20];
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",&a1[i][j]);
        }
    }
    
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            sum[i][j]=a[i][j]-a1[i][j];
            printf("%d ",sum[i][j]);
        }printf("\n");
      }
  return 0;
}
