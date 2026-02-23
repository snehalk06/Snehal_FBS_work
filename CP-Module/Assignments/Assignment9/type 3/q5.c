#include <stdio.h>
void alternate(int*);
int main()
{
    int arr[5];
  alternate(arr);
}
void alternate(int*arr){
    printf("Enter elements of array:\n");
    for(int i = 0; i < 5; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("Alternate elements are:\n");
    for(int i = 0; i < 5; i = i + 2)
    {
        printf("%d ", arr[i]);
    }
}
