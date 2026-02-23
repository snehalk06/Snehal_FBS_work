#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "Hello";

    char *ptr = strchr(str, 'e');

    printf("%s", ptr);

    
}
