#include<Stdio.h>
void main()
{
	int a,b;
	char op;
	int result;
	printf("Enter no1=");
	scanf("%d",&a);
	printf("Enter no2=");
	scanf("%d",&b);
	printf("Enter a operator(+,-,*,/,%)");
	scanf(" %c",&op);
	if(op=='+')
	printf("Result=%d",a+b);
	else if(op=='-')
	printf("Result=%d",a-b);
	else if(op=='*')
	printf("Result=%d",a*b);
	else if(op=='%')
	printf("Result=%d",a%b);
	else if(op=='/')
	{
		if(b!=0)
		{
			printf("Result=%d",a/b);
		}
		else
		
			printf("divisible by zero is not allowed");

		}
		else
		{
			printf("Invalid Operator");
			}	
		
}