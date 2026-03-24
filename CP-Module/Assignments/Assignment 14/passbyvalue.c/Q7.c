#include<stdio.h>

typedef struct Time
{
    int hour;
    int min;
    int sec;
}Time;

Time storeTime();
void display(Time);

int main()
{
    Time t1,t2;

    t1 = storeTime();
    t2 = storeTime();

    display(t1);
    display(t2);

    return 0;
}

Time storeTime()
{
    Time temp;
    printf("Enter hour minute second: ");
    scanf("%d %d %d",&temp.hour,&temp.min,&temp.sec);
    return temp;
}

void display(Time t)
{
    printf("Time is: %d:%d:%d\n",t.hour,t.min,t.sec);
}