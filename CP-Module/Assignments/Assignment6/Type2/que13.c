#include<stdio.h>
int isleapyear();
void main()
{
	int x=isleapyear();
	if(x==1)
	printf("The year is leap year");
	else
	printf("The year is not leap");
}
int isleapyear()
{
		int year=2024;
	if(year%4==0)
	return 1;
	else
	return 0;
}
