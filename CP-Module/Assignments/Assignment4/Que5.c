#include <stdio.h>

int main() {
    int choice, num;
    int i, j, count;
    int rem, sum, rev, temp;

    while (1) {   
        printf("\n------ MENU ------\n");
        printf("1. Even or Odd\n");
        printf("2. Prime or Not (Nested Loop)\n");
        printf("3. Positive / Negative / Zero\n");
        printf("4. Reverse Number\n");
        printf("5. Sum of Digits\n");
        printf("6. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        if (choice == 6) {
            printf("Exiting program...\n");
            break;
        }

        printf("Enter a number: ");
        scanf("%d", &num);

        switch (choice) {

        case 1:   
            if (num % 2 == 0)
                printf("%d is Even\n", num);
            else
                printf("%d is Odd\n", num);
            break;

        case 2:   // Prime or Not (Nested Loop)
            count = 0;
            for (i = 1; i <= 1; i++) {          // outer loop
                for (j = 1; j <= num; j++) {   // inner loop
                    if (num % j == 0)
                        count++;
                }
            }
            if (count == 2)
                printf("%d is Prime\n", num);
            else
                printf("%d is Not Prime\n", num);
            break;

        case 3:   
            if (num > 0)
                printf("%d is Positive\n", num);
            else if (num < 0)
                printf("%d is Negative\n", num);
            else
                printf("Number is Zero\n");
            break;

        case 4:   
            temp = num;
            rev = 0;
            while (temp != 0) {
                rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }
            printf("Reverse = %d\n", rev);
            break;

        case 5:   
            temp = num;
            sum = 0;
            while (temp != 0) {
                rem = temp % 10;
                sum += rem;
                temp = temp / 10;
            }
            printf("Sum of digits = %d\n", sum);
            break;

        default:
            printf("Invalid choice!\n");
        }
    }

    return 0;
}
