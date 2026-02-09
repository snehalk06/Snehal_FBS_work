#include<stdio.h>
int main()
{
    int arr[5];
    printf("Enter elements of array: \n");
    for(int i=0;i<5;i++)
    scanf("%d",&arr[i]);

    for(int i=0;i<5;i++)
    printf("%d  ",arr[i]);

    //searching no is array
    int ele=30;
    int isfound=0;
    for(int i = 0; i < 5; i++)
    {
    	if(arr[i]==ele)
    	{
    		printf(" No is found");
    		isfound=1;
    		break;
		}
	}
	if(isfound==0)
	printf("No is Not found");
    

   

    


}