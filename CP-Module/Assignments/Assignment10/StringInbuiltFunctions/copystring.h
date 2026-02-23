#include<stdio.h>
#include<string.h>
int main()
{
    char src[] = "C";
    char dest[10];
    strcpy(dest, src);
    printf("%s", dest);
}
