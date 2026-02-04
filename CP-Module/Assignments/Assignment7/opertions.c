#include <stdio.h>

void result(int*a, int*b, char*op);   // function declaration

int main()
{
    int a, b;
    char op;

    printf("Enter no1 = ");
    scanf("%d", &a);

    printf("Enter no2 = ");
    scanf("%d", &b);

    printf("Enter an operator (+, -, *, /, %%): ");
    scanf(" %c", &op);

    result(&a, &b, &op);   // function call with arguments

    return 0;
}

void result(int*a, int*b, char*op)    // function definition
{
    if (*op == '+')
        printf("Result = %d", *a + *b);
    else if (*op == '-')
        printf("Result = %d", *a - *b);
    else if (*op == '*')
        printf("Result = %d", *a * *b);
    else if (*op == '%')
        printf("Result = %d", *a % *b);
    else if (*op == '/')
    {
        if (*b != 0)
            printf("Result = %d", *a / *b);
        else
            printf("Division by zero is not allowed");
    }
    else
        printf("Invalid Operator");
}
