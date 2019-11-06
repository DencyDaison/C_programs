#include<stdio.h>
int main()
{
    int i,j,r,c,k;
    scanf("%d %d", &r, &c);
    int a[r][c];
    for(i = 0; i < r; i++)
    {
        for(j = 0; j < c; j++)
        {
           scanf("%d", &a[i][j]);
        }
    }
    
        for(k = 0; k < c; k++)
        {
              for(i = 0, j = k; j < c ; i++, j++)
              {
            printf("%d ", a[i][j]);
        }}
        return 0;
 }


