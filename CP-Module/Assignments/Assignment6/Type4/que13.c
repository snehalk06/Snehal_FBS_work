#include <stdio.h>

int isleapyear(int year);   // function declaration

int main()
{
    int year;

    printf("Enter a year: ");
    scanf("%d", &year);

    if (isleapyear(year))
        printf("%d is a leap year\n", year);
    else
        printf("%d is not a leap year\n", year);

    return 0;
}

int isleapyear(int year)    // function definition
{
    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        return 1;   // leap year
    else
        return 0;   // not a leap year
}
