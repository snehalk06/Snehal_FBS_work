#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "hello";
    char *ptr = strpbrk(str, "aeiou");

    printf("%s", ptr);

   
}
