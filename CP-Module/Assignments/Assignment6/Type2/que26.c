#include <stdio.h>

int divisible();   // Type-2 function declaration

void main()
{
    int r;
    r = divisible();   // function call

    if (r == 1)
        printf("Number is divisible by both 3 and 5");
    else if (r == 2)
        printf("Number is divisible by 3 but not 5");
    else if (r == 3)
        printf("Number is divisible by 5 but not 3");
    else
        printf("Number is not divisible by both");
}

int divisible()
{
    int num;

    printf("Enter a number : ");
    scanf("%d", &num);

    if (num % 3 == 0 && num % 5 == 0)
        return 1;
    else if (num % 3 == 0)
        return 2;
    else if (num % 5 == 0)
        return 3;
    else
        return 4;
}
