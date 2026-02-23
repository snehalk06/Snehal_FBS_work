#include <stdio.h>
void sorted(int*,int,int);
int main()
{
        int arr[50], n,temp;

    printf("Enter number of elements: ");
    scanf("%d", &n);
sorted(arr,n,temp);
}
void sorted(int*arr,int n,int temp){
    printf("Enter array elements:\n");
    for(int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    /* Sorting logic */
    for(int i = 0; i < n - 1; i++)
    {
        for(int j = 0; j < n - 1 - i; j++)
        {
            if(arr[j] > arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    printf("Sorted array in ascending order:\n");
    for(int i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
}
