#include<stdio.h>

typedef struct Complex
{
    float real;
    float imaginary;
}Complex;

void storeArray(Complex *arr,int size);
void displayArray(Complex *arr,int size);

int main()
{
    int size;

    printf("Enter number of complex numbers: ");
    scanf("%d",&size);

    Complex arr[size];

    storeArray(arr,size);
    displayArray(arr,size);

    
}

void storeArray(Complex *arr,int size)
{
    printf("Enter real and imaginary parts:\n");

    for(int i=0;i<size;i++)
    {
        printf("Complex %d\n",i+1);
        scanf("%f %f",&arr[i].real,&arr[i].imaginary);
    }
}

void displayArray(Complex *arr,int size)
{
    printf("\nComplex numbers are:\n");

    for(int i=0;i<size;i++)
    {
        printf("%.2f + %.2fi\n",arr[i].real,arr[i].imaginary);
    }
}