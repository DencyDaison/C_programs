#include<stdio.h>
int main()
{
int c, array[100], size, location, maximum;
  scanf("%d", &size);
  for (c = 0; c < size; c++)
    scanf("%d", &array[c]);
  location = find_maximum(array, size);
  maximum  = array[location];
 
  printf("%d", location);
  return 0;
}
 
int find_maximum(int a[], int n) {
  int c, max, index;
 
  max = a[0];
  index = 0;
 
  for (c = 1; c < n; c++) {
    if (a[c] > max) {
       index = c;
       max = a[c];
    }
  }
 
  return index;
}
