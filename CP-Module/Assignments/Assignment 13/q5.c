#include <stdio.h>
#include<stdlib.h>

int main()
{
    int*arr=(int*)malloc(5*sizeof(int));

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

    return 0;
}
