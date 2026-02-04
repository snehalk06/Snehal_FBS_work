#include <stdio.h>

int isgreater(int, int, int);   // function declaration

int main()
{
    int a, b, c, result;

    printf("Enter no1: ");
    scanf("%d", &a);

    printf("Enter no2: ");
    scanf("%d", &b);

    printf("Enter no3: ");
    scanf("%d", &c);

    result = isgreater(a, b, c);   // function call

    printf("%d is greater", result);

    return 0;
}

int isgreater(int a, int b, int c)   // function definition
{
    if (a > b && a > c)
        return a;
    else if (b > c)
        return b;
    else
        return c;
}
