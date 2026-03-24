#include<stdio.h>

typedef struct Time
{
    int hour;
    int min;
    int sec;
}Time;

void storeArray(Time *arr,int size);
void displayArray(Time *arr,int size);

int main()
{
    int size;

    printf("Enter number of times: ");
    scanf("%d",&size);

    Time arr[size];

    storeArray(arr,size);
    displayArray(arr,size);

    
}

void storeArray(Time *arr,int size)
{
    printf("Enter hour minute second:\n");

    for(int i=0;i<size;i++)
    {
        printf("Time %d\n",i+1);
        scanf("%d %d %d",&arr[i].hour,&arr[i].min,&arr[i].sec);
    }
}

void displayArray(Time *arr,int size)
{
    printf("\nTimes are:\n");

    for(int i=0;i<size;i++)
    {
        printf("%d:%d:%d\n",arr[i].hour,arr[i].min,arr[i].sec);
    }
}