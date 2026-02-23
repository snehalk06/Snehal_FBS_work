#include <stdio.h>
#include <string.h>

int main() {
    char str1[] = "abcdef";
    char str2[] = "abcxyz";

    int result = strncmp(str1, str2, 3);

    printf("%d", result);
}