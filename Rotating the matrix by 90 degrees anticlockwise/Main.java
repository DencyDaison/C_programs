#include<stdio.h>
int main()
{
    int i,j,r,c;
    scanf("%d %d", &r, &c);
    int a[r][c];
    for(i = 0; i < r; i++)
    {
        for(j = 0; j < c; j++)
        {
           scanf("%d", &a[i][j]);
        }
    }
    
       for(i=r-1;i>=0;i--)
       {
           for(j=0;j<=c-1;j++)
           {
               printf("%d ",a[j][i]);
           }printf("\n");
       }
        return 0;
 }


