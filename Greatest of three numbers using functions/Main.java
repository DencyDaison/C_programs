#include <stdio.h>
int greatest_of_2_numbers(int s1, int s2);
int main(){
	int s1, s2, s3;
	scanf("%d%d%d", &s1, &s2, &s3);
	int greatest = greatest_of_2_numbers(s1, s2);
	printf("%d", greatest_of_2_numbers(greatest, s3));
  	return 0;
}
int greatest_of_2_numbers(int h1, int h2){
    int max = 0;
    if(h1 > h2){
        max = h1; 
    }
    else{
        max = h2;
    }
    return max;
}