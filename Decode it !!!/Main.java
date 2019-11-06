#include<stdio.h>
int main()
{
    char s[100], c;
    int i, k;
    //Input of the encoded word and key value
    scanf("%[^\n]s",s);
    scanf("%d",&k);			
    k=k%26;
    //Loop to Decode the given word 
    for(i = 0; s[i] != '\0';i++)		
    {
        c = s[i];
        //For lower case alphabets
        if(c >= 'a' && c <= 'z')			
        {
            c = c - k;
            if(c < 'a')
            {
                c = c + 'z' - 'a' + 1;
            }
            
            s[i] = c;
        }
        //For Upper case alphabets
        else if(c >= 'A' && c <= 'Z')		
        {
            c = c - k;
            
            if(c < 'A')
            {
                c = c + 'Z' - 'A' + 1;
            }
            s[i] = c;
        }
    }
    //Printing the Output
    printf("%s", s);					
    
    return 0;
}