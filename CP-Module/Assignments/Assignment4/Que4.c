#include <stdio.h>

int main() {
    int n, num, temp, rem;
    int i, fact, sum;

    printf("Enter n: ");
    scanf("%d", &n);

    for (num = 1; num <= n; num++) {
        temp = num;
        sum = 0;

        while (temp > 0) {
            rem = temp % 10;
            fact = 1;
            for (i = 1; i <= rem; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        if (sum == num) {
            printf("%d\n", num);
        }
    }

    return 0;
}
