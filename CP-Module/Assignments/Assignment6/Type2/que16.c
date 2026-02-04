#include<stdio.h>
int uppercaselowercase();
void main()
{
	int s=uppercaselowercase();
	if(s==1)
	printf("The char is Uppercase");
	else
	printf("The char is Lowercase");
		
}
int uppercaselowercase()
{
char ch ='s';
	if(ch>='A'&&ch<='Z')
	return 1;
	else
	return 2;
}