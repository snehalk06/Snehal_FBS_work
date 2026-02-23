#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "I love C programming";
    char *ptr = strstr(str, "C");

    printf("%s", ptr);

    
}
