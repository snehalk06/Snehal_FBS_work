#include<Stdio.h>
void ispalindrome();
void main()
{
	ispalindrome();

}
void ispalindrome()

{
	int num=121;
	int reverse,r1=1,r2=2,r3=1;
	int rev=r3*100+r2*10+1;
	if(num==rev)
	{
		printf("no is palindrome");
	}
	else
	{
		printf("no is not palindrome");
	}
	
}
