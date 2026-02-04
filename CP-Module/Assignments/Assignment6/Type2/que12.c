#include<Stdio.h>
int ispalindrome();
void main()
{
	int res=ispalindrome();
	if(res==1)
	printf("no is palindrome");
	else
	printf("no is not palindrome");

}
int ispalindrome()

{
	int num=121;
	int reverse,r1=1,r2=2,r3=1;
	int rev=r3*100+r2*10+1;
	if(num==rev)
	return 1;
	else
	return 0;
}
