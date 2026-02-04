#include <stdio.h>

void vowelconstant(char ch);   // function declaration

int main()
{
    char ch = 'h';
    vowelconstant(ch);          // function call with argument
    return 0;
}

void vowelconstant(char ch)     // function definition with argument
{
    if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
        ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
    {
        printf("Character is a vowel");
    }
    else
    {
        printf("Character is a consonant");
    }
}
