#include<stdio.h>
int main()
{
    int i,j,m,n;
    scanf("%d%d",&m,&n);
   int a[m][n],t[n][m];
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
   /* for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            printf("%d ",a[i][j]);
        } printf("\n");
    }
     printf("\n");
     printf("\n");*/
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            t[j][i]=a[i][j];
            //printf("%d ",t[i][j]);
        } 
    }
     for(i=0;i<n;i++)
    {
        for(j=0;j<m;j++)
        {
           // t[j][i]=a[i][j];
            printf("%d ",t[i][j]);
        } printf("\n");
    }
    
    return 0;
}
