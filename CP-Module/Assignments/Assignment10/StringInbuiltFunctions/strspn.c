#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "abc123";
    int result = strspn(str, "abc");

    printf("%d", result);

    
}
