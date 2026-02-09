inlude <stdio.h>

int main()
{
    int a[50], b[50], merge[100];
    int n1, n2, i;

    printf("Enter size of first array: ");
    scanf("%d", &n1);

    printf("Enter elements of first array:\n");
    for(i = 0; i < n1; i++)
    {
        scanf("%d", &a[i]);
    }

    printf("Enter size of second array: ");
    scanf("%d", &n2);

    printf("Enter elements of second array:\n");
    for(i = 0; i < n2; i++)
    {
        scanf("%d", &b[i]);
    }

    /* Copy first array */
    for(i = 0; i < n1; i++)
    {
        merge[i] = a[i];
    }

    /* Copy second array */
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
