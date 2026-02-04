#include <stdio.h>

int divisible(int);   // function declaration

void main()
{
    int num, result;

    printf("Enter a number : ");
    scanf("%d", &num);

    result = divisible(num);

    if(result == 1)
        printf("Number divisible by both 3 and 5");
    else if(result == 2)
        printf("Number divisible by 3 not 5");
    else if(result == 3)
        printf("Number divisible by 5 not 3");
    else
        printf("Number is not divisible by both");
}

int divisible(int num)   // function with return type
{
    if(num % 3 == 0 && num % 5 == 0)
        return 1;
    else if(num % 3 == 0)
        return 2;
    else if(num % 5 == 0)
        return 3;
    else
        return 0;
}
