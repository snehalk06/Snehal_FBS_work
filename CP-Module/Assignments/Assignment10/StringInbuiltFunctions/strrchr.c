#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "Hello";

    char *ptr = strrchr(str, 'l');

    printf("%s", ptr);

   
}
