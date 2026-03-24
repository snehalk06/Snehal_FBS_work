#include<stdio.h>
typedef struct Student
{
    int rollno;
    char name[20];
    int marks;
}Student;
Student storeStudent();
void display(Student s);

void main()
{
    Student s1,s2;
    s1=storeStudent();
    s2=storeStudent();
    


    display(s1);
    display(s2);
}
 Student storeStudent()
{
    Student temp;
    printf("Enter rollno name and marks of student");
    scanf("%d%s%d",&temp.rollno,temp.name,&temp.marks);
    return temp;

}
void display(Student s)
{
    printf("Roll_no=%d  Name=%s Marks=%d\n",s.rollno,s.name,s.marks);
}