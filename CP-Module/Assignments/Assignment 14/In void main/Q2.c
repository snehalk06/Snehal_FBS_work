#include<stdio.h>
typedef struct Employee
{
    int id;
    char name[20];
    double salary;
}Employee;
void main()
{
    Employee E1,E2;
    printf("Enter details of Employee:id,name,salary;\n");
    scanf("%d%s%lf",&E1.id,E1.name,&E1.salary);
    scanf("%d%s%lf",&E2.id,E2.name,&E2.salary);


     printf(" details of Employee:\n");
     printf("id=%d  name=%s   salary=%lf\n",E1.id,E1.name,E1.salary);
     printf("id=%d  name=%s  salary=%lf",E2.id,E2.name,E2.salary);





}