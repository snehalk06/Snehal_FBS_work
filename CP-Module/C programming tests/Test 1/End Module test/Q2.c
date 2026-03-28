#include<stdio.h>

int main()
{
    int n;
    int term=0;

    printf("Enter num: ");
    scanf("%d",&n);

    for(int i=1;i<=n;i++)
    {
        term=term*10+1;
        printf("%d ",term);
    }
    
}