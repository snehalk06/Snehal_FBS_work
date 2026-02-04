#include <stdio.h>

float discount();   // Type-2 function declaration

void main()
{
    float d;
    d = discount();     // function call

    if (d > 0)
        printf("Discount = %.2f", d);
    else
        printf("There is no discount");
}

float discount()
{
    char stud;
    int price;
    float dis = 0;

    printf("Are you student or not (y/n)? : ");
    scanf(" %c", &stud);   // space before %c is important

    printf("Enter the price : ");
    scanf("%d", &price);

    if (stud == 'y')
    {
        if (price > 500)
            dis = 0.20f * price;
        else
            dis = 0.10f * price;
    }
    else if (stud == 'n')
    {
        if (price > 600)
            dis = 0.15f * price;
        else
            dis = 0;
    }

    return dis;   // returning discount value
}
