#include <stdio.h>
#include<stdlib.h>

int main()
{
    int*arr=(int*)malloc(5*sizeof(int));
    int sum=0;

    printf("Enter 5 elements:\n");
    for(int i = 0; i < 5; i++)
    {
        scanf("%d", &arr[i]);
    }

    for(int i = 0; i < 5; i++)
    {
        sum = sum + arr[i];
    }

    printf("Sum of elements = %d", sum);

    return 0;
}
