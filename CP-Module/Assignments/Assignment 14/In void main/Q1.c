#include<stdio.h>
typedef struct student
{
    int rollno;
    char name[20];
    int marks;
}Student;
void main()
{
    Student s1,s2;
    printf("Enter details of student:rollno,name,marks;\n");
    scanf("%d%s%d",&s1.rollno,s1.name,&s1.marks);
    scanf("%d%s%d",&s2.rollno,s2.name,&s2.marks);



     printf(" details of students:\n");
     printf("rollno=%d,  name=%s,  marks=%d\n",s1.rollno,s1.name,s1.marks);
      printf("rollno=%d,  name=%s,  marks=%d",s2.rollno,s2.name,s2.marks);





}