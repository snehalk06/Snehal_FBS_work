#include<stdio.h>
int age(int a);
void main()
{
	int a=18;
	int res=age(a);
	if(res==1)
	printf("The person is eligible");
	else
	printf("The person is not eligible");
}
int age(int a)
{
	
	if(age>=18)
	return 1;
	else
	return 0;
}