#include <stdio.h>
void reversed();
int main()
{
reversed();
}
void reversed(){
        int arr[50], n, i, temp;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter array elements:\n");
    for(i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    /* Reverse the same array */
    for(i = 0; i < n / 2; i++)
    {
        temp = arr[i];
        arr[i] = arr[n - 1 - i];
        arr[n - 1 - i] = temp;
    }

    printf("Reversed array:\n");
    for(i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }
}

