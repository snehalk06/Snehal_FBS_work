#include<stdio.h>
int age();
void main()
{
	int res=age();
	if(res==1)
	printf("The person is eligible for voting");
	else
	printf("The person is not eligible for voting");
	
}
int age()
{
		int age=18;
	if(age>=18)
	return 1;
	else
	return 0;
}

