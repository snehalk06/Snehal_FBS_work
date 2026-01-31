#include<Stdio.h>
void main()
{
	int stud;
	int price;
	float discount;
	printf("Are you student or not(y or n)? :");
	scanf("%c",&stud);
	printf("Enter the price :");
	scanf("%d",&price);
	if(stud=='y')
	{
		if(price>500)
		{
			discount=0.20f*price;
			printf("%f is a discount",discount);
		}
		else
		{
			discount=0.10f*price;
			printf("%f is disount",discount);
		}
	}
	else
	{
		if(stud=='n')
		{
			if(price>600)
			{
				discount=0.15f*price;
			printf("%f is discount",discount);
			}
			else
			printf("There is no discount");
	    }
		
	}
}