#include <stdio.h>

int result();   // function declaration with return type

void main()
{
    int res;
    res = result();      // function call
    printf("Result = %d", res);
}

int result()
{
    int a, b;
    char op;

    printf("Enter no1 = ");
    scanf("%d", &a);

    printf("Enter no2 = ");
    scanf("%d", &b);

    printf("Enter an operator (+, -, *, /, %%): ");
    scanf(" %c", &op);

    if (op == '+')
        return a + b;
    else if (op == '-')
        return a - b;
    else if (op == '*')
        return a * b;
    else if (op == '%')
        return a % b;
    else if (op == '/')
    {
        if (b != 0)
            return a / b;
        else
        {
            printf("Division by zero not allowed\n");
            return 0;
        }
    }
    else
    {
        printf("Invalid Operator\n");
        return 0;
    }
}
