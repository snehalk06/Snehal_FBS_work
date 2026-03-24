
#include<stdio.h>

typedef struct SalesManager
{
    int id;
    char name[20];
    double salary;
    double incentive;
    double target;
}SalesManager;

int main()
{
    SalesManager S1, S2;

    printf("Enter details of SalesManager (id name salary incentive target):\n");
    scanf("%d %s %lf %lf %lf", &S1.id, S1.name, &S1.salary, &S1.incentive, &S1.target);
    scanf("%d %s %lf %lf %lf", &S2.id, S2.name, &S2.salary, &S2.incentive, &S2.target);

    printf("\nDetails of SalesManager:\n");
    printf("id=%d name=%s salary=%lf incentive=%lf target=%lf\n", S1.id, S1.name, S1.salary, S1.incentive, S1.target);
    printf("id=%d name=%s salary=%lf incentive=%lf target=%lf\n", S2.id, S2.name, S2.salary, S2.incentive, S2.target);

    return 0;
}