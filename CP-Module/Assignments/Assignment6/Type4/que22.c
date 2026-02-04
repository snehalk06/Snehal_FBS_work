#include <stdio.h>

float dis(char stud, int price);

int main()
{
    char stud;
    int price;
    float discount;

    printf("Are you student or not (y or n)? : ");
    scanf(" %c", &stud);

    printf("Enter the price : ");
    scanf("%d", &price);

    discount = dis(stud, price);

    if (discount > 0)
        printf("Discount is %.2f", discount);
    else
        printf("There is no discount");

    return 0;
}

float dis(char stud, int price)
{
    float discount = 0.0f;

    if (stud == 'y')
    {
        if (price > 500)
            discount = 0.20f * price;
        else
            discount = 0.10f * price;
    }
    else if (stud == 'n')
    {
        if (price > 600)
            discount = 0.15f * price;
    }

    return discount;
}
