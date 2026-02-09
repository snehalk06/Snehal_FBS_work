#include <stdio.h>

int main()
{
    int arr[5]  = {1, 2, 3, 4, 5};
    int arrr[5] = {10, 20, 30, 40, 50};
    int crr[5];
    int i;

    for(i = 0; i < 5; i++)
    {
        crr[i] = arr[i] + arrr[i];
    }

    printf("Sum stored in third array:\n");
    for(i = 0; i < 5; i++)
    {
        printf("%d ", crr[i]);
    }
}
