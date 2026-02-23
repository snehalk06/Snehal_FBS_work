#include <stdio.h>
#include<stdlib.h>

int main()
{
    int *arr=(int*)malloc(5*sizeof(int));
    int *arrr=(int*)malloc(5*sizeof(int));
    int *crr=(int*)malloc(5*sizeof(int));;
    

    for(int i = 0; i < 5; i++)
    {
        crr[i] = arr[i] + arrr[i];
    }

    printf("Sum stored in third array:\n");
    for(int i = 0; i < 5; i++)
    {
        printf("%d ", crr[i]);
    }
}
