#include<stdio.h>
int vowelconstant();
void main()
{
	int y=vowelconstant();
	if(y==1)
	printf("char is vowel");
	else
    printf("char is constant");
	
}
int vowelconstant()
{
	char ch='h';
	if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
	return 1;
	else
	return 2;
}
