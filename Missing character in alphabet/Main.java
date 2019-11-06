#include<stdio.h>
#include<string.h>
int main()
{
  int i=0,j=0,c[26]={0};
  char s[100];
  scanf("%[^\n]s",&s);
  while(s[i]!='\0')
  {
    if(s[i]>='a'&&s[i]<='z')
    {
      j=s[i]-'a';
      c[j]++;
    }
    i++;
  }
  for(i=0;i<26;i++)
  {
    if(c[i]==0)
    {
      printf("%c ",i+'a',c[i]);
      c[i]=0;
    }
  }
  return 0;
}
