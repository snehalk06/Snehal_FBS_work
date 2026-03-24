#include<stdio.h>

typedef struct SalesManager
{
    int id;
    char name[20];
    double salary;
    double incentive;
    double target;
}SalesManager;

void storeArray(SalesManager *arr,int size);
void displayArray(SalesManager *arr,int size);

int main()
{
    int size;

    printf("Enter number of SalesManagers: ");
    scanf("%d",&size);

    SalesManager arr[size];

    storeArray(arr,size);
    displayArray(arr,size);

   
}

void storeArray(SalesManager *arr,int size)
{
    printf("Enter details of SalesManager:\n");

    for(int i=0;i<size;i++)
    {
        printf("SalesManager %d\n",i+1);

        printf("Enter Id: ");
        scanf("%d",&arr[i].id);

        printf("Enter Name: ");
        scanf("%s",arr[i].name);

        printf("Enter Salary: ");
        scanf("%lf",&arr[i].salary);

        printf("Enter Incentive: ");
        scanf("%lf",&arr[i].incentive);

        printf("Enter Target: ");
        scanf("%lf",&arr[i].target);
    }
}

void displayArray(SalesManager *arr,int size)
{
    printf("\nSalesManager Details:\n");

    for(int i=0;i<size;i++)
    {
        printf("Id=%d Name=%s Salary=%.2lf Incentive=%.2lf Target=%.2lf\n",
        arr[i].id,arr[i].name,arr[i].salary,arr[i].incentive,arr[i].target);
    }
}