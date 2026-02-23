#include<stdio.h>
#include<string.h>
int main(){
    char str1[100];
    char temp[100];
    printf("Enter String-1:");
    scanf("%s",str1);
    strcpy(temp,str1);
    strrev(str1);
    int res=strcmp(str1,temp);
    if(res==0)
        printf("Palindrome");
        else
        printf("Not Palindrome");

}