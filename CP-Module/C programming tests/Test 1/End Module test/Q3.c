#include<stdio.h>

typedef struct Song{
    int id;
    char title[50];
    char artist[50];
    float duration;

}Song;
Song s[10];
int n=0;

void addSong()
{
    printf("Enter Song Id: ");
    scanf("%d",&s[n].id);

    printf("Enter Title: ");
    scanf("%s",s[n].title);

    printf("Enter Artist : ");
    scanf("%s",s[n].artist);


    printf("Enter duration: ");
    scanf("%f",&s[n].duration);


    printf("Song is added");
    n++;
}

void displaySongs()
{
    if(n==0)
    {
        printf("No songs available\n");
    }

    for(int i=0;i<n;i++)
    {
        printf("\nSong Id:%d",s[i].id);
        printf("\n Title :%s",s[i].title);
        printf("\nSong artist:%s",s[i].artist);
        printf("\nSong duaration:%f",s[i].duration);
    }
}
 int main()
 {
    int choice;

    do{
        printf("\n1.Add Song");
        printf("\n2.Display Songs");
        printf("\n3.Exit");
        printf("\n1.Enter choice: ");
        scanf("%d",&choice);

        switch(choice)
        {
            case 1:
            addSong();
            break;

            case 2:
            displaySongs();
            break;

            case 3:
            printf("Exit");


            default:
            printf("Invalid choice");

        }


        }while(choice !=3);

    }
 






