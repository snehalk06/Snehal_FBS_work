#include<stdio.h>

typedef struct Product
{
    int id;
    char name[20];
    int quantity;
    float price;
}Product;

Product storeProduct();
void display(Product);

int main()
{
    Product p1,p2;

    p1 = storeProduct();
    p2 = storeProduct();

    display(p1);
    display(p2);

    return 0;
}

Product storeProduct()
{
    Product temp;
    printf("Enter product id, name, quantity, price:\n");
    scanf("%d %s %d %f",&temp.id,temp.name,&temp.quantity,&temp.price);
    return temp;
}

void display(Product p)
{
    printf("Product Details:\n");
    printf("Id=%d Name=%s Quantity=%d Price=%.2f\n",p.id,p.name,p.quantity,p.price);
}