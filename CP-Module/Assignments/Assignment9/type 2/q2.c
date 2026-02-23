int main()
{
int res=isFound();
if(res==0)
printf("Not Found");
else
printf("Found");
}
int isFound(){
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
    		isfound=1;
    		break;
		}
	}
	if(isfound==0)
	return 0;
    else
    return 1;
}