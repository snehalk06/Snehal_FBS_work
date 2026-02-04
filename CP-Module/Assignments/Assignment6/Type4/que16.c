#include<stdio.h>
int uppercaselowercase(char ch);
int main()
{
	char ch ='s';
	int s=uppercaselowercase(ch);
	if(s==1)
	printf("The char is Uppercase");
	else
	printf("The char is Lowercase");
		
}
int uppercaselowercase(char ch)
{

	if(ch>='A'&&ch<='Z')
	return 1;
	else
	return 2;
}