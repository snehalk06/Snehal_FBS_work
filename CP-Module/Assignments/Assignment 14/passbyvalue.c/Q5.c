#include<stdio.h>

typedef struct SalesManager
{
    int id;
    char name[20];
    double salary;
    double incentive;
    double target;
}SalesManager;
SalesManager storesalesManger();
void display(SalesManager S);
int main()
{
    SalesManager S1, S2;

    S1=storesalesManger();
    S2=storesalesManger();


    display(S1);
    display(S2);
}
 SalesManager storesalesManger()
{
    SalesManager temp;
    printf("Enter details of SalesManager (id name salary incentive target):\n");
    scanf("%d %s %lf %lf %lf", &temp.id, temp.name, &temp.salary, &temp.incentive, &temp.target);
    return temp;
}
void display(SalesManager S)
{
    printf("\nDetails of SalesManager:\n");
    printf("id=%d name=%s salary=%lf incentive=%lf target=%lf\n", S.id, S.name, S.salary, S.incentive, S.target);
}