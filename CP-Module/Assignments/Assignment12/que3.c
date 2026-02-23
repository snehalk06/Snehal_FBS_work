#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    printf("Enter String:");
    fgets(str,sizeof(str),stdin);
    int index;
    printf("Enter index to remove char:");
    scanf("%d",&index);
    for(int i=index;str[i]!='\0';i++){
        str[i]=str[i+1];
    }
    printf("After remove Char:\n");
    printf("%s",str);
}