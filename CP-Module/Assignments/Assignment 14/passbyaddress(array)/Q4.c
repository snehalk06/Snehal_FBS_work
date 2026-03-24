#include<stdio.h>

typedef struct HR
{
    int id;
    char name[20];
    double salary;
    double commission;
}HR;

void storeArray(HR *arr, int size);
void displayArray(HR *arr, int size);

int main()
{
    int size;

    printf("Enter number of HR: ");
    scanf("%d",&size);

    HR arr[size];

    storeArray(arr,size);
    displayArray(arr,size);
}
    

void storeArray(HR *arr, int size)
{
    printf("Enter details of HR:\n");

    for(int i=0;i<size;i++)
    {
        printf("HR %d\n",i+1);

        printf("Enter Id: ");
        scanf("%d",&arr[i].id);

        printf("Enter Name: ");
        scanf("%s",arr[i].name);

        printf("Enter Salary: ");
        scanf("%lf",&arr[i].salary);

        printf("Enter Commission: ");
        scanf("%lf",&arr[i].commission);
    }
}

void displayArray(HR *arr, int size)
{
    printf("\nHR Details:\n");

    for(int i=0;i<size;i++)
    {
        printf("Id=%d Name=%s Salary=%.2lf Commission=%.2lf\n",
        arr[i].id,arr[i].name,arr[i].salary,arr[i].commission);
    }
}