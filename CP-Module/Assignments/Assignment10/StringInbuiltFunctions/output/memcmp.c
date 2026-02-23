#include <stdio.h>
#include <string.h>

int main() {
    char str1[] = "abc";
    char str2[] = "abd";

    int result = memcmp(str1, str2, 3);

    printf("%d", result);

   
}
