#include<stdio.h>

typedef struct Complex
{
    float real;
    float imaginary;
}Complex;

int main()
{
    Complex c1;

    printf("Enter real and imaginary part: ");
    scanf("%f %f",&c1.real,&c1.imaginary);

    printf("Complex number is: %.2f + %.2fi", c1.real, c1.imaginary);

    return 0;
}