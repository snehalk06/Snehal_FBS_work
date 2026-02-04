#include<stdio.h>
void vowelconstant();
void main()
{
	vowelconstant();

}
void vowelconstant()
{
	char ch='h';
	if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U')
	{
		printf("char is vowel");
	}
	else
	{
		printf("char is constant");
	}
}
