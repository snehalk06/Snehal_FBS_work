#include<stdio.h>
#include<stdlib.h>
int main()
{
    int *arr=(int*)malloc(5 * sizeof(int));
    printf("Enter elements of array: \n");
    for(int i=0;i<5;i++)
    scanf("%d",&arr[i]);

    for(int i=0;i<5;i++)
    printf("%d  ",arr[i]);

    int min,max;

    //assume first element
    min=arr[0];
    max=arr[0]; 

    //compare remaining elements

    for(int i=1;i<5;i++)
    {
        if(arr[i]<min)
        min=arr[i];

        if(arr[i]>max)
        max=arr[i];
    }
    printf("Minimum no is=%d\n",min);
    printf("Maximum no is=%d",max);

    return 0;


}