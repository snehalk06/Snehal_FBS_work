#include<stdio.h>
void main()
{
	int s1,s2,s3;
	printf("Enter side 1:");
	scanf("%d",&s1);
	printf("Enter side 2:");
	scanf("%d",&s2);
	printf("Enter side 3:");
	scanf("%d",&s3);
	if(s1==s2&&s2==s3&&s3==s1)
	printf("Triangle is equilateral");
	else if(s1==s2||s2==s3||s3==s1)
	printf("Triangle is Isoscles");
	else
	printf("triangle is Scalene");
	
}