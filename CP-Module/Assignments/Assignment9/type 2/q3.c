#include <stdio.h>
int sum();
int main()
{
 int res= sum();
 printf("SUM:%d",res);
}
int sum(){
        int arr[5], i;
        int sum = 0;

    printf("Enter 5 elements:\n");
    for(i = 0; i < 5; i++)
    {
        scanf("%d", &arr[i]);
    }

    for(i = 0; i < 5; i++)
    {
        sum = sum + arr[i];
    }

    return sum;
}
