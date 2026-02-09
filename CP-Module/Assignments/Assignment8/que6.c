#include <stdio.h>

int main()
{
    int arr[10], n, i, j, count;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter array elements:\n");
    for(i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("Prime numbers in the array are:\n");

    for(i = 0; i < n; i++)
    {
        if(arr[i] <= 1)
            continue;

        count = 0;
        for(j = 2; j <= arr[i] / 2; j++)
        {
            if(arr[i] % j == 0)
            {
                count = 1;
                break;
            }
        }

        if(count == 0)
            printf("%d ", arr[i]);
    }
}
