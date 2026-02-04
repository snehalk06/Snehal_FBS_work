#include <stdio.h>

int vowelconstant(char ch);   // function declaration

int main()
{
    char ch = 'h';
   int res= vowelconstant(ch);          // function call with argument
    if(res==1)
    {
    	
        printf("Character is a vowel");
	}
	else
	printf("Character is a consonant");
	
	return 0;
}

int vowelconstant(char ch)     // function definition with argument
{
    if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
        ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
    {
    	return 1;
    }
    else
    {
    	return 2;
    }
}
