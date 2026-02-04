#include<Stdio.h>
void divisible(int*num);
void main()
{
	int num;
	printf("Enter a number : ");
	scanf("%d",&num);
	divisible(&num);
}
void divisible(int *num)
{

	if(*num%3==0&&*num%5==0)
	{
		printf(" number divisble by both");
	}
	else
	{
		if(*num%3==0&&*num%5!=0)
		{
			printf("Number divisible by 3 not 5");
		}
		else
		{
			if(*num%5==0&&*num%3!=0)
			{
				printf("Number divisible by 5 not 3");
			}
			else
			{
				printf("Number is not divisible by both ");
			}
		}	
	}
	
}