#include<stdio.h>
#include<string.h>
int main()
{
char s1[20],s2[20];
scanf("%s",s1);
int l=strlen(s1);
int beg=0;
int end=l-1;
for(int i=end;i>=0;i--)
{
s2[beg]=s1[i];
beg++;
}
s2[beg]='\0';
//printf("%s",s2);
int c=strcmp(s1,s2);
if(c==0)
{
printf("%s is a palindrome",s1);
}
else
{ 
printf("%s is not a palindrome",s1);
}
return 0;
}
