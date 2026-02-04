#include<Stdio.h>
double totalsalary(double bs);
void main()
{
	double bs=7000;
	double ts=totalsalary(bs);
	printf("Total salary is:%lf",ts);

}
double totalsalary(double bs)
{
		int da,ta,hra;
	if(bs<=5000)
	{
		da=0.10*bs;
		ta=0.20*bs;
		hra=0.25*bs;
		
	}
	else
	{
		da=0.15*bs;
		ta=0.25*bs;
		hra=0.30*bs;	
		
	}
	double ts=da+ta+hra+bs;
	return ts;

}
