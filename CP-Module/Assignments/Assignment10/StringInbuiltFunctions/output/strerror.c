#include <stdio.h>
#include <string.h>
#include <errno.h>

int main() {
    printf("%s", strerror(2));

    return 0;
}
