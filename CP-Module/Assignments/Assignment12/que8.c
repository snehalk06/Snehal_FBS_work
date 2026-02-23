#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    printf("Enter String:");
    fgets(str,sizeof(str),stdin);
    int len =strlen(str)-1;
    printf("Number of words in string are:%d",len);
}