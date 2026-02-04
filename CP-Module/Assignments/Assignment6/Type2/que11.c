#include<stdio.h>
int evenodd();
void main()
{
	int res=evenodd();
	if(res==1)
	printf("No is even");
	else
	printf("No is odd");
	
}
int evenodd()
{
		int num=5;
	if(num%2==0)
	return 1;
  else
  return 0;
}