#include<stdio.h>

typedef struct Complex
{
    float real;
    float imaginary;
}Complex;

Complex storeComplex();
void display(Complex c);

int main()
{
    Complex c1,c2;

    c1 = storeComplex();
    c2 = storeComplex();

    display(c1);
    display(c2);

    return 0;
}

Complex storeComplex()
{
    Complex temp;
    printf("Enter real and imaginary part: ");
    scanf("%f %f",&temp.real,&temp.imaginary);
    return temp;
}

void display(Complex c)
{
    printf("Complex number is: %.2f + %.2fi\n", c.real, c.imaginary);
}