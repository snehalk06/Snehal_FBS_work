#include<stdio.h>
#include<string.h>

int main() {
    char src[] = "Program";
    char dest[10];
    strncpy(dest, src, 4);
    dest[4] = '\0';
    printf("%s", dest);
}
