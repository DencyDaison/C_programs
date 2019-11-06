#include<stdio.h>
#include<string.h>
int main()
{
    char s[100],ch;
    int i,j,c;
    scanf("%[^\n]s",s);
    int len=strlen(s);
    char a[100];
    /*for(i=0;i<len;i++)
    {
        a[i]=0;
    }*/
    for(i=0;i<len;i++)
    {
         c=0;
        for(j=0;j<len;j++)
        {
            if(i!=j && s[i]==s[j] )
            {
               c=1;
               break;
            }
        }
        if(c==0)
        {
            ch=s[i];
            break;
        }
    }
        if(c==0)
        {
            printf("%c",ch);
        }
        else
        {
            printf("All the characters are repetitive");
        }
    
    return 0;
    
}