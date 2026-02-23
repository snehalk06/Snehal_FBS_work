#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    int isFound=0;
    printf("Enter String:");
    scanf("%s",str);
    char ch;
    printf("Enter Char which you want to find:");
    scanf(" %c",&ch);
    for(int i=0;str[i]!='\0';i++){
        if(str[i]==ch){
        isFound=1;
        break;
        }
    }
    if(isFound)
    printf("Found");
    else
    printf("Not Found");
}