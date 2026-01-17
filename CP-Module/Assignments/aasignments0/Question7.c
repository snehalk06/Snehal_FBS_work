#include<stdio.h>
int main()
{
	int mins=6002;
	int min=mins%10;
	int hr=mins/10;
	int hrs=hr/60;
	printf("hrs is %d and min is %d",hrs,min);
}
