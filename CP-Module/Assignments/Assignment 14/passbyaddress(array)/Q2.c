#include<stdio.h>

typedef struct Employee
{
    int id;
    char name[20];
    double salary;
}Employee;

void storeArray(Employee arr[] ,int size);
void displayArray(Employee arr[], int size);

int main()
{
    int size;

    printf("Enter number of employees: ");
    scanf("%d",&size);

    Employee arr[size];

    storeArray(arr,size);
    displayArray(arr,size);

    
}

void storeArray(Employee arr[], int size)
{
    printf("Enter details of Employees:\n");

    for(int i=0;i<size;i++)
    {
        printf("Employee %d\n",i+1);

        printf("Enter Id: ");
        scanf("%d",&arr[i].id);

        printf("Enter Name: ");
        scanf("%s",arr[i].name);

        printf("Enter Salary: ");
        scanf("%lf",&arr[i].salary);
    }
}

void displayArray(Employee arr[], int size)
{
    printf("\nEmployees are:\n");

    for(int i=0;i<size;i++)
    {
        printf("Id=%d Name=%s Salary=%.2lf\n",
        arr[i].id,arr[i].name,arr[i].salary);
    }
}