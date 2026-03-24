#include<stdio.h>
typedef struct HR
{
    int id;
    char name[20];
    double salary;
    double commssion;
}HR;
void main()
{
    HR HR1,HR2;
    printf("Enter details of HR:id,name,salary,commssion;\n");
    scanf("%d%s%lf%lf",&HR1.id,HR1.name,&HR1.salary,&HR1.commssion);
    scanf("%d%s%lf%lf",&HR2.id,HR2.name,&HR2.salary,&HR2.commssion);


     printf(" details of HR:\n");
     printf("id=%d  name=%s   salary=%lf    commssion=%lf \n",HR1.id,HR1.name,HR1.salary,HR1.commssion);
     printf("id=%d  name=%s  salary=%lf    commssion=%lf ",HR2.id,HR2.name,HR2.salary,HR2.commssion);




}