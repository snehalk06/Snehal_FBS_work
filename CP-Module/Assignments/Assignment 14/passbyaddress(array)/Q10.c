#include<stdio.h>

typedef struct Product
{
    int id;
    char name[20];
    int quantity;
    float price;
}Product;

void storeArray(Product *arr,int size);
void displayArray(Product *arr,int size);

int main()
{
    int size;

    printf("Enter number of products: ");
    scanf("%d",&size);

    Product arr[size];

    storeArray(arr,size);
    displayArray(arr,size);

    
}

void storeArray(Product *arr,int size)
{
    printf("Enter product id, name, quantity, price:\n");

    for(int i=0;i<size;i++)
    {
        printf("Product %d\n",i+1);

        scanf("%d %s %d %f",
        &arr[i].id,
        arr[i].name,
        &arr[i].quantity,
        &arr[i].price);
    }
}

void displayArray(Product *arr,int size)
{
    printf("\nProduct Details:\n");

    for(int i=0;i<size;i++)
    {
        printf("Id=%d Name=%s Quantity=%d Price=%.2f\n",
        arr[i].id,
        arr[i].name,
        arr[i].quantity,
        arr[i].price);
    }
}