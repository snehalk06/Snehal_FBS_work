#include <stdio.h>
void Sum(int*,int);
int main()
{
            int arr[5];
        int sum = 0;

       Sum(arr,sum);
}
void Sum(int*arr,int sum){
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
}
