#include <stdio.h>

int result();   // Type-2 function declaration

void main()
{
    int r;
    r = result();   // function call

    if (r == 1)
        printf("Distinction");
    else if (r == 2)
        printf("First Class");
    else if (r == 3)
        printf("Second Class");
    else if (r == 4)
        printf("Pass Class");
    else
        printf("Fail");
}

int result()
{
    int marks;

    printf("Enter the marks: ");
    scanf("%d", &marks);

    if (marks > 75)
        return 1;
    else if (marks > 65)
        return 2;
    else if (marks > 55)
        return 3;
    else if (marks >= 40)
        return 4;
    else
        return 5;
}
