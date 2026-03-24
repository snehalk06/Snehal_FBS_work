#include<stdio.h>
typedef struct Student
{
    int rollno;
    char name[20];
    int marks;
}Student;
void storearray(Student*arr,int size);

void displayarray(Student*arr,int size);
int main()
{
    Student arr[5];

    storearray(arr,5);
    displayarray(arr,5);
   
}
void  storearray(Student*arr,int size)
{
    printf("Enter details od Students:\n");
    for(int i=0;i<size;i++)
    {
        scanf("%d",&arr[i].rollno);
        scanf("%s",arr[i].name);
        scanf("%d",&arr[i].marks);
     }

}
void displayarray(Student*arr,int size)
{
 
    printf("Students are:");
    for(int i=0;i<size;i++)
    {
        printf("rollno=%d"  ,arr[i].rollno);
        printf("name=%s"  ,arr[i].name);
        printf("marks=%d\n  ",arr[i].marks);
    }
}