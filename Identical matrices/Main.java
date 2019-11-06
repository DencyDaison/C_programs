#include <stdio.h>
int main()
{
    int i,j,r,c,f=0;
    scanf("%d %d", &r, &c);
    int a[r][c];
    for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
           scanf("%d", &a[i][j]);
        }
    }
    int b[r][c];
    for(int i = 0; i < r; i++){
        for(int j = 0; j < c; j++){
           scanf("%d", &b[i][j]);
        }
    }
    for(i = 0; i < r; i++)
    {
        for(j = 0; j < c; j++)
        {
           if(a[i][j] != b[i][j])
           {
                f = 1;
                break;
           }
       }
    }
    if(f== 0)
       printf("Yes");
    else
       printf("No");
}