#include<Stdio.h>
void isgreater(int*a,int*b ,int*c );
void main()
{
	int a,b,c;
	printf("Enter no1:");
	scanf("%d",&a);
	printf("Enter no2:");
	scanf("%d",&b);
	printf("Enter no3:");
	scanf("%d",&c);
	isgreater(&a,&b,&c);
}
void isgreater(int *a,int *b,int *c)
{
		
	if(*a>*b)
		if(*a>*c)
		printf(" %d is greater",*a);
		else
		printf("%d is greater",*c);
	else if(*b>*c)
	printf("%d is greater",*b);
	
	else
		printf("%d is greater",*c);
	
}