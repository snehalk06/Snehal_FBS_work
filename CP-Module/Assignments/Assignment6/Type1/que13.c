#include<stdio.h>
void isleapyear();
void main()
{
	isleapyear();
}
void isleapyear()
{
		int year=2024;
	if(year%4==0)
	{
		printf("The year is leap year");
	}
	else
	{
		printf("The year is not leap");
	}
}
