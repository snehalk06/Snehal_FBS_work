#include <stdio.h>
#include <string.h>

int main() {
    char str[] = "abc123";
    int result = strcspn(str, "124");

    printf("%d", result);

   
}
