#include <stdio.h>
#include <math.h>

int main() {
    int n, num, temp, rem;
    int digits, sum;

    printf("Enter n: ");
    scanf("%d", &n);

    for (num = 1; num <= n; num++) {

        temp = num;
        digits = 0;
        sum = 0;

        while (temp > 0) {
            digits++;
            temp = temp / 10;
        }

        temp = num;

        while (temp > 0) {
            rem = temp % 10;
            sum = sum + pow(rem, digits);
            temp = temp / 10;
        }

        if (sum == num) {
            printf("%d\n", num);
        }
    }

    return 0;
}
