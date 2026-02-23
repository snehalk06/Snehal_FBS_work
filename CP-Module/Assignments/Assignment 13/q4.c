#include <stdio.h>
#include<stdlib.h>

int main()
{
    int*arr=(int*)malloc(5*sizeof(int));

    printf("Enter 5 elements of array:\n");
    for(int i = 0; i < 5; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("\nEven and Odd elements:\n");
    for(int i = 0; i < 5; i++)
    {
        if(arr[i] % 2 == 0)
            printf("%d is Even\n", arr[i]);
        else
            printf("%d is Odd\n", arr[i]);
    }

    return 0;
}
