#include<stdio.h>

typedef struct Date
{
    int date;
    int month;
    int year;
}Date;

void storeArray(Date *arr,int size);
void displayArray(Date *arr,int size);

int main()
{
    int size;

    printf("Enter number of dates: ");
    scanf("%d",&size);

    Date arr[size];

    storeArray(arr,size);
    displayArray(arr,size);

    
}

void storeArray(Date *arr,int size)
{
    printf("Enter date month year:\n");

    for(int i=0;i<size;i++)
    {
        printf("Date %d\n",i+1);
        scanf("%d %d %d",&arr[i].date,&arr[i].month,&arr[i].year);
    }
}

void displayArray(Date *arr,int size)
{
    printf("\nDates are:\n");

    for(int i=0;i<size;i++)
    {
        printf("%d/%d/%d\n",arr[i].date,arr[i].month,arr[i].year);
    }
}