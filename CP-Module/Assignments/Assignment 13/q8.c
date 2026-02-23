#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *a, *b, *merge;
    int n1, n2, i;

    printf("Enter size of first array: ");
    scanf("%d", &n1);

    // Allocate memory for first array
    a = (int*) malloc(n1 * sizeof(int));

    printf("Enter elements of first array:\n");
    for(i = 0; i < n1; i++)
    {
        scanf("%d", &a[i]);
    }

    printf("Enter size of second array: ");
    scanf("%d", &n2);

    // Allocate memory for second array
    b = (int*) malloc(n2 * sizeof(int));

    printf("Enter elements of second array:\n");
    for(i = 0; i < n2; i++)
    {
        scanf("%d", &b[i]);
    }

    // Allocate memory for merged array
    merge = (int*) malloc((n1 + n2) * sizeof(int));

    // Copy first array
    for(i = 0; i < n1; i++)
    {
        merge[i] = a[i];
    }

    // Copy second array
    for(i = 0; i < n2; i++)
    {
        merge[n1 + i] = b[i];
    }

    printf("Merged array:\n");
    for(i = 0; i < n1 + n2; i++)
    {
        printf("%d ", merge[i]);
    }

}