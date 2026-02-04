#include<stdio.h>
void uppercaselowercase(char*ch);
void main()
{
	char ch ='s';
	uppercaselowercase(&ch);
		
}
void uppercaselowercase(char*ch)
{

	if(ch>='A'&&ch<='Z')
	{
		printf("The char is Uppercase");
	}
	else
	{
		printf("The char is Lowercase");
	}	
}