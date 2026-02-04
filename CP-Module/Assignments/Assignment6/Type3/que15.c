#include<stdio.h>
void age(int);
void main()
{
	int a=18;
	age(a);
}
void age(int a)
{
	
	if(age>=18)
	{
		printf("The person is eligible for voting");
	}
	else
	{
		printf("The person is eligible for not voting");
	}
}