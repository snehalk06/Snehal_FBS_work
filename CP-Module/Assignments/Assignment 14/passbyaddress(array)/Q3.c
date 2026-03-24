#include<stdio.h>

typedef struct Admin
{
    int id;
    char name[20];
    double salary;
    double allowance;
}Admin;

void storeArray(Admin *arr, int size);
void displayArray(Admin *arr, int size);

int main()
{
    int size;

    printf("Enter number of admins: ");
    scanf("%d",&size);

    Admin arr[size];

    storeArray(arr,size);
    displayArray(arr,size);

    
}

void storeArray(Admin *arr, int size)
{
    printf("Enter details of Admin:\n");

    for(int i=0;i<size;i++)
    {
        printf("Admin %d\n",i+1);

        printf("Enter Id: ");
        scanf("%d",&arr[i].id);

        printf("Enter Name: ");
        scanf("%s",arr[i].name);

        printf("Enter Salary: ");
        scanf("%lf",&arr[i].salary);

        printf("Enter Allowance: ");
        scanf("%lf",&arr[i].allowance);
    }
}

void displayArray(Admin *arr, int size)
{
    printf("\nAdmins are:\n");

    for(int i=0;i<size;i++)
    {
        printf("Id=%d Name=%s Salary=%.2lf Allowance=%.2lf\n",
        arr[i].id,arr[i].name,arr[i].salary,arr[i].allowance);
    }
}