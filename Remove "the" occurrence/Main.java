#include<stdio.h>
#include<string.h>
int main()
{
    char s[100],c,tmp[100];
    int i,j;
    scanf("%[^\n]s",s);
    int len=strlen(s);
    char a[100];
   
    for(i=0;i<=len;i++)
    {
            if((s[i]=='t'||'T') && s[i+1]=='h' && s[i+2]=='e')
            {
               i=i+3;
            }
            else
            {
                tmp[c]=s[i];
                c++;
            }
    }
    tmp[c]='\0';
    printf("%s\n",tmp);
    return 0;
    
}