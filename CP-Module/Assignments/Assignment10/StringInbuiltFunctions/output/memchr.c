#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "Hello";

    char *ptr = memchr(str, 'l', 5);

    printf("%s", ptr);

    
}
