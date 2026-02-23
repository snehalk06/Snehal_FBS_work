#include<stdio.h>
#include<string.h>
int main(){
    char str1[100];
    char str2[100];
    int len1=0;
    int len2=0;
    printf("Enter String-1:");
    scanf("%s",str1);
    printf("Enter String-2:");
    scanf("%s",str2);
    for(int i=0;str1[i]!='\0';i++){
        len1++;
    }
    for(int i=0;str2[i]!='\0';i++){
        len2++;
    }
    if(len1>len2)
    printf("String-1 is greater than String-2");
    else if (len2>len1)
    printf("String-2 is greater than String-1");
    else
    printf("Both are Equal");

}