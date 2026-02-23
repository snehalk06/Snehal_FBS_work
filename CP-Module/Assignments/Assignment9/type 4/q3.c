#include <stdio.h>

int sum(int arr[], int size);   // Function declaration

int main()
{
    int arr[5];
    int res;

    printf("Enter 5 elements:\n");
    for(int i = 0; i < 5; i++)
    {
        scanf("%d", &arr[i]);
    }

    res = sum(arr, 5);   // Passing array & size

    printf("SUM: %d", res);

    return 0;
}

// Function definition with parameters
int sum(int arr[], int size)
{
    int total = 0;

    for(int i = 0; i < size; i++)
    {
        total = total + arr[i];
    }

    return total;   // Returning sum
}