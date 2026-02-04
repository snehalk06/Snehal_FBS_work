#include <stdio.h>

int isgreater();   // function declaration (Type-2)

void main()
{
    int g;
    g = isgreater();          // function call
    printf("%d is greater", g);
}

int isgreater()
{
    int a, b, c;

    printf("Enter no1: ");
    scanf("%d", &a);

    printf("Enter no2: ");
    scanf("%d", &b);

    printf("Enter no3: ");
    scanf("%d", &c);

    if (a > b)
    {
        if (a > c)
            return a;
        else
            return c;
    }
    else
    {
        if (b > c)
            return b;
        else
            return c;
    }
}
