#include <stdio.h>
#include <string.h>

int main() {
    char str1[] = "Hello";
    char str2[] = "Hello";

    int result = strcmp(str1, str2);

    printf("%d", result);

    return 0;
}
