#include<stdio.h>
#include<string.h>
#define MAX_LEN 40

int main()
{
    char str[MAX_LEN];
    scanf("%s",str);
    int len = strlen(str);
    
    int c_c, r_c;
    scanf("%d", &c_c);
    r_c = (len / c_c);
    if((len % c_c) > 0)
    {
        r_c = r_c + 1;
    }
    
    int col_i, row_i;
    for(col_i = 0; col_i < c_c; col_i++)
    {
        for(row_i = 0; row_i < r_c; row_i++)
        {
            int curr_char_idx = col_i + (row_i * c_c);
            if((row_i % 2) == 0)
            {
                // Do nothing
            }
            else
            {
                int last_col_elem_index_in_curr_row = (c_c - 1) + (row_i * c_c);
                curr_char_idx = last_col_elem_index_in_curr_row - col_i;
            }
            
            char ch;
            if(curr_char_idx >= len)
            {
                ch = 'X';
            }
            else
            {
                ch = str[curr_char_idx];
            }
            
            printf("%c", ch);
        }
    }
        
    return 0;
}