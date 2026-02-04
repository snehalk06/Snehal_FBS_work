#include <stdio.h>

void isleapyear(int*year);   // function declaration

int main()
{
    int year = 2024;
    isleapyear(&year);        // function call with argument
    return 0;
}

void isleapyear(int*year)    // function definition
{
    if (*year % 4 == 0)
        printf("The year is a leap year");
    else
        printf("The year is not a leap year");
}
