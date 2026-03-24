#include<stdio.h>
typedef struct HR
{
    int id;
    char name[20];
    double salary;
    double commission;
}HR;
HR storeHR();
void display(HR  H);

void main()
{
    HR  H1,H2;   
    H1=storeHR();
    H2=storeHR();

    display(H1);
    display(H2);
}
HR  storeHR ()
{
    HR temp;
    printf("Enter id name salary and commission of HR :\n");
    scanf("%d%s%lf%lf",&temp.id,temp.name,&temp.salary,&temp.commission);
    return temp;

}
void display(HR  H)
{
    printf("Id=%d  Name=%s  Salaray=%lf,commission=%lf\n",H.id,H.name,H.salary,H.commission);
}