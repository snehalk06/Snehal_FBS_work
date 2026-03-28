#include <stdio.h>

int main() {
    int n;
    int term = 0;

    printf("Enter number of terms: ");
    scanf("%d", &n);

    printf("Series: ");

    for(int i = 1; i <= n; i++) {
        term = term * 10 + 1;   // next term create
        printf("%d", term);

        if(i < n)
            printf(" + ");
    }

    return 0;
}
