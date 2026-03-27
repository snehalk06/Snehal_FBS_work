#include<stdio.h>
#include<stdlib.h>
#include<string.h>
 

typedef struct Player {
    int jerseyNo;
    char name[50];
    int runs;
    int wickets;
    int matches;
} Player;

Player *p=NULL;
int count = 0;
int size =6;

/////////////////////////////////////////////////////////

void init(){
    p=(Player*)malloc(size* sizeof(Player));
}

/////////////////////////////////////////////////////////////
void addPlayer(){

//resize if full

 if(count==size){
    size=size*2;
    Player *temp= (Player*)realloc(p,size*sizeof(Player));
    if(temp !=NULL){
    p=temp;
    printf("\nMemory Incresed! New Size=%d\n",size);
 }else{
    printf("Memory Allocation Failed!\n");
    return;
 }
}
 
 

printf("\nEnter JerseyNo:\n");
scanf("%d",&p[count].jerseyNo);

printf("\nEnter  Name:");
scanf("%s",p[count].name);

printf("\nEnter runs:\n");
scanf("%d",&p[count].runs);

printf("\nEnter wickets:\n");
scanf("%d",&p[count].wickets);


printf("\nEnter matches:\n");
scanf("%d",&p[count].matches);

count++;
printf("----Player Added Successfully----");
}
 
///////////////////////////////////////////////////////////
void displayPlayers(){
    printf("\n-----ALL PLAYERS-----\n");
    for(int i=0;i<count;i++){
        printf("\nJersey:%d | Name:%s | Runs:%d | Wickets:%d | Matches:%d",
        p[i].jerseyNo, p[i].name, p[i].runs, p[i].wickets, p[i].matches);
    }
}

///////////////////////////////////////////////////////////////////
void searchByJersey(){
    int num, found=0;
    printf("Enter Jersey No:");
    scanf("%d",&num);

    for(int i=0;i<count;i++){
        if(p[i].jerseyNo==num){
            found=1;
            printf("Found:%s",p[i].name);
        }
    }
    if(found==0) printf("Not Found");
}
//////////////////////////////////////////////////////////////////////
void searchByName(){
    char name[50];
    int found=0;
    printf("Enter Player Name: ");
    scanf("%s",name);

    for(int i=0;i<count;i++){
        if(strcmp(p[i].name,name)==0){
            found=1;
            printf("Found: Jersey No = %d",p[i].jerseyNo);
        }
    }
    if(found==0) printf("Not Found");
}
//////////////////////////////////////////////////////////
void removePlayer(){
    int num;
    printf("Enter Jersey No to delete: ");
    scanf("%d",&num);

    for(int i=0;i<count;i++){
        if(p[i].jerseyNo==num){
            for(int j=i;j<count-1;j++){
                p[j]=p[j+1];
            }
            count--;
            printf("Player Deleted Successfully!\n");
            return;
        }
    }
    printf("Player Not Found\n");
}
//////////////////////////////////////////////////////////////////////////////////
void updatePlayer(){
    int num, found=0;
    printf("Enter Jersey No for Updating: ");
    scanf("%d",&num);

    for(int i=0;i<count;i++){
        if(p[i].jerseyNo==num){
            found=1;

            printf("Enter New Runs:");
            scanf("%d",&p[i].runs);

            printf("Enter New Wickets:");
            scanf("%d",&p[i].wickets);

            printf("Enter New Matches:");
            scanf("%d",&p[i].matches);

            printf("Updated Successfully!");
        }
    }
    if(found==0) printf("Player Not Found");
}
/////////////////////////////////////////////////////////////////////////////////////////
void topRuns(){
    Player temp;

    for(int i=0;i<count-1;i++){
        for(int j=0;j<count-1-i;j++){
            if(p[j].runs < p[j+1].runs){
                temp=p[j];
                p[j]=p[j+1];
                p[j+1]=temp;
            }
        }
    }

    printf("\nTop 3 Players (Runs):\n");
    for(int i=0;i<3 && i<count;i++){
        printf("%s\n", p[i].name);
    }
}
/////////////////////////////////////////////////////////////////////
void topWickets(){
    Player temp;

    for(int i=0;i<count-1;i++){
        for(int j=0;j<count-1-i;j++){
            if(p[j].wickets < p[j+1].wickets){
                temp=p[j];
                p[j]=p[j+1];
                p[j+1]=temp;
            }
        }
    }

    printf("\nTop 3 Players (Wickets):\n");
    for(int i=0;i<3 && i<count;i++){
        printf("%s\n", p[i].name);
    }
}
/////////////////////////////////////////////////////////////////////
int main(){
    int choice;

    init();

    do{
        printf("\n======PLAYER MANAGEMENT SYSTEM======");
        printf("\n1. Add Player");
        printf("\n2. Remove Player");
        printf("\n3. Search by Jersey");
        printf("\n4. Search by Name");
        printf("\n5. Update Player");
        printf("\n6. Top Runs");
        printf("\n7. Top Wickets");
        printf("\n8. Display All");
        printf("\n0. EXIT");
        printf("\nEnter Choice:");
        scanf("%d",&choice);

        switch(choice){
            case 1:addPlayer(); break;
            case 2:removePlayer(); break;
            case 3:searchByJersey(); break;
            case 4:searchByName(); break;
            case 5:updatePlayer(); break;
            case 6:topRuns(); break;
            case 7:topWickets(); break;
            case 8:displayPlayers(); break;
            case 0:printf("EXITING...."); break;
            default:printf("Invalid Choice");
        }
    }while(choice!=0);

    free(p);
}










