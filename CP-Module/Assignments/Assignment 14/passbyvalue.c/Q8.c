#include<stdio.h>

typedef struct Distance
{
    int feet;
    int inch;
}Distance;

Distance storeDistance();
void display(Distance);

int main()
{
    Distance d1,d2;

    d1 = storeDistance();
    d2 = storeDistance();

    display(d1);
    display(d2);

    return 0;
}

Distance storeDistance()
{
    Distance temp;
    printf("Enter feet and inches: ");
    scanf("%d %d",&temp.feet,&temp.inch);
    return temp;
}

void display(Distance d)
{
    printf("Distance is: %d feet %d inch\n", d.feet, d.inch);
}