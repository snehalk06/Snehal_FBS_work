#include<stdio.h>

int main()
{
    char str[100];
    int words=0;
    printf("Enter a String: ");
    fgets(str,sizeof(str),stdin);
    for(int i=0;str[i]!='\0';i++)
    {
        if((str[i]==' '|| str[i]=='\n' || str[i]=='\t')&&(str[i+1]!=' ' && str[i+1]!='\0'))
        {
            words++;
        }
    }
    if(str[0]!='\0')
    words++;

    printf("Number of Words=%d",words);        
    
}
