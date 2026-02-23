#include <stdio.h>
#include <string.h>

int main() {
    char src[] = "Hello";
    char dest[10];

    memcpy(dest, src, 6);

    printf("%s", dest);

    
}
