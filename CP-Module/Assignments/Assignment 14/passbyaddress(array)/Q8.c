#include<stdio.h>

typedef struct Distance
{
    int feet;
    int inch;
}Distance;

void storeArray(Distance *arr,int size);
void displayArray(Distance *arr,int size);

int main()
{
    int size;

    printf("Enter number of distances: ");
    scanf("%d",&size);

    Distance arr[size];

    storeArray(arr,size);
    displayArray(arr,size);

}

void storeArray(Distance *arr,int size)
{
    printf("Enter feet and inches:\n");

    for(int i=0;i<size;i++)
    {
        printf("Distance %d\n",i+1);
        scanf("%d %d",&arr[i].feet,&arr[i].inch);
    }
}

void displayArray(Distance *arr,int size)
{
    printf("\nDistances are:\n");

    for(int i=0;i<size;i++)
    {
        printf("%d feet %d inch\n",arr[i].feet,arr[i].inch);
    }
}