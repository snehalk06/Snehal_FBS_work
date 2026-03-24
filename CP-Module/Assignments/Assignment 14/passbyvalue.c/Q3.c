#include<stdio.h>
typedef struct Admin
{
    int id;
    char name[20];
    double salary;
    double allowance;
}Admin;
Admin storeAdmin();
void display(Admin A);

void main()
{
    Admin A1,A2;
    A1=storeAdmin();
    A2=storeAdmin();

    display(A1);
    display(A2);
}
Admin storeAdmin()
{
    Admin temp;
    printf("Enter id name salary and allowance of Admin:\n");
    scanf("%d%s%lf%lf",&temp.id,temp.name,&temp.salary,&temp.allowance);
    return temp;

}
void display(Admin A)
{
    printf("Id=%d  Name=%s  Salaray=%lf,Allowance=%lf\n",A.id,A.name,A.salary,A.allowance);
}