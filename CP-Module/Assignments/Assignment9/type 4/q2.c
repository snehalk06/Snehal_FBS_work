#include <stdio.h>

int isFound(int arr[], int size, int ele);   // Function declaration

int main()
{
    int arr[5];
    int ele = 30;

    printf("Enter elements of array:\n");
    for(int i = 0; i < 5; i++)
        scanf("%d", &arr[i]);

    int res = isFound(arr, 5, ele);   // Passing array, size & element

    if(res == 0)
        printf("Not Found");
    else
        printf("Found");

    return 0;
}

// Function definition with parameters
int isFound(int arr[], int size, int ele)
{
    for(int i = 0; i < size; i++)
    {
        if(arr[i] == ele)
        {
            return 1;   // Found
        }
    }
    return 0;   // Not Found
}