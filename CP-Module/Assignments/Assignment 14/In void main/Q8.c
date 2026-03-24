#include<stdio.h>

typedef struct Distance
{
    int feet;
    int inch;
}Distance;

int main()
{
    Distance d1;

    printf("Enter feet and inches: ");
    scanf("%d %d",&d1.feet,&d1.inch);

    printf("Distance is: %d feet %d inch", d1.feet, d1.inch);

    return 0;
}