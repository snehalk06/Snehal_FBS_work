#include<stdio.h>

typedef struct Product
{
    int id;
    char name[20];
    int quantity;
    float price;
}Product;

int main()
{
    Product p1;

    printf("Enter product id, name, quantity, price:\n");
    scanf("%d %s %d %f",&p1.id,p1.name,&p1.quantity,&p1.price);

    printf("Product Details:\n");
    printf("Id=%d Name=%s Quantity=%d Price=%.2f",p1.id,p1.name,p1.quantity,p1.price);
    
}