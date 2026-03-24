#include<stdio.h>

typedef struct Date
{
    int date;
    int month;
    int year;
}Date;
Date storedate();
void display(Date );

int main()
{
    Date d1,d2;
    d1=storedate();
    d2=storedate();
    display(d1);
    display(d2);
}
Date storedate()
{
    Date temp;
    printf("Enter date month year: ");
    scanf("%d %d %d",&temp.date,&temp.month,&temp.year);
    return temp;
}
void display(Date d)
{
     printf("Date is: %d/%d/%d",d.date,d.month,d.year);

}