#include<stdio.h>

typedef struct Time
{
    int hour;
    int min;
    int sec;
}Time;

int main()
{
    Time t1;

    printf("Enter hour minute second: ");
    scanf("%d %d %d",&t1.hour,&t1.min,&t1.sec);

    printf("Time is: %d:%d:%d",t1.hour,t1.min,t1.sec);

    return 0;
}