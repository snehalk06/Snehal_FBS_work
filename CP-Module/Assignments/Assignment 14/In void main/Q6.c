#include<stdio.h>

typedef struct Date
{
    int date;
    int month;
    int year;
}Date;

int main()
{
    Date d1;

    printf("Enter date month year: ");
    scanf("%d %d %d",&d1.date,&d1.month,&d1.year);

    printf("Date is: %d/%d/%d",d1.date,d1.month,d1.year);

    
}