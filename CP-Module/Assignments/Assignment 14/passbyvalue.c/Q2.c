#include<stdio.h>
typedef struct Employee
{
    int id;
    char name[20];
    double salary;
}Employee;
Employee storeEmployee();
void display(Employee E);
int main()
{
    Employee E1,E2;
    E1=storeEmployee();
    E2=storeEmployee();

    display(E1);
    display(E2);
}
Employee storeEmployee()
{
    Employee temp;
    printf("Enter details of employee id , name and salary:\n");
    scanf("%d%s%lf",&temp.id,temp.name,&temp.salary);
    return temp;
}
void display(Employee E)
{
    printf("Id=%d  Name=%s  Salaray=%lf\n",E.id,E.name,E.salary);
}