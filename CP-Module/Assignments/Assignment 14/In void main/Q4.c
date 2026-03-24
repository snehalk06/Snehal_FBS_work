#include<stdio.h>
typedef struct Admin
{
    int id;
    char name[20];
    double salary;
    double allowance;
}Admin;
void main()
{
    Admin A1,A2;
    printf("Enter details of Admin:id,name,salary,allowance;\n");
    scanf("%d%s%lf%lf",&A1.id,A1.name,&A1.salary,&A1.allowance);
    scanf("%d%s%lf%lf",&A2.id,A2.name,&A2.salary,&A2.allowance);


     printf(" details of Admin:\n");
     printf("id=%d  name=%s   salary=%lf    allowance=%lf \n",A1.id,A1.name,A1.salary,A1.allowance);
     printf("id=%d  name=%s  salary=%lf    allowance=%lf ",A2.id,A2.name,A2.salary,A2.allowance);
}