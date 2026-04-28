import java.util.Scanner;

class Player {
    String name;
    int jerseyNum, totalRuns, totalWkts, matchesPlayed;
}

public class PlayeraManagement {
    static Player[] players = new Player[100];
    static int count = 0;

    static Scanner sc = new Scanner(System.in);

    static void addPlayer() {
        Player p = new Player();

        System.out.println("------ Enter Player Details --------");
        do {

            System.out.println("Player Name: ");
            p.name = sc.nextLine();

            if (duplicateName(p.name)) {
                System.out.println("Name is Already Exists.Try Again!");
            }
        } while (duplicateName(p.name));

        do {
            System.out.println("Jersey Number: ");
            p.jerseyNum = sc.nextInt();
            sc.nextLine();

            if (p.jerseyNum <= 0) {
                System.out.println("Jersey Number must be Positive.Try Again!");
            }
        } while (p.jerseyNum <= 0);
        do {
            System.out.println("Total Runs: ");
            p.totalRuns = sc.nextInt();
            sc.nextLine();

            if (p.totalRuns <= 0) {
                System.out.println("Runs must be Positive.Try Again!");
            }
        } while (p.totalRuns <= 0);
        do {
            System.out.println("Total Wkts: ");
            p.totalWkts = sc.nextInt();
            sc.nextLine();

            if (p.totalWkts <= 0) {
                System.out.println("Wkts must be Positive.Try Again!");
            }
        } while (p.totalWkts <= 0);
        do {
            System.out.println("Matches Played: ");
            p.matchesPlayed = sc.nextInt();
            sc.nextLine();

            if (p.matchesPlayed <= 0) {
                System.out.println("It must be Positive.Try Again!");
            }
        } while (p.matchesPlayed <= 0);

        players[count++] = p;

        System.out.println("******* Player Added Successfully *******");

    }

    static void removePlayer() {
        String name;
        System.out.println("Player Name: ");
        boolean found = false;
        name = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (players[i].name.equalsIgnoreCase(name)) {
                found = true;
                for (int j = i; j < count - 1; j++) {
                    players[j] = players[j + 1];
                }
            }
        }
        if (found == true) {
            count--;
            System.out.println("Plyer Removed Successfully!");
        } else {
            System.out.println("Player Not Found!");
        }
    }

    static void searchByName() {
        String name;
        System.out.println("Player Name: ");
        boolean found = false;
        name = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (players[i].name.equalsIgnoreCase(name)) {
                found = true;
                System.out.println("Player: " + players[i].name + " | Total Runs: " + players[i].totalRuns
                        + " | Total Wkts: " + players[i].totalWkts);
            }
        }
        if (found == false) {
            System.out.println("Player Not Found!");
        }
    }

    static void searchByJNum() {
        int jNum;
        System.out.println("Jersey Number: ");
        boolean found = false;
        jNum = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (players[i].jerseyNum == jNum) {
                found = true;
                System.out.println("Player: " + players[i].name + " | Total Runs: " + players[i].totalRuns
                        + " | Total Wkts: " + players[i].totalWkts);
            }
        }
        if (found == false) {
            System.out.println("Player Not Found!");
        }
    }

    static void sortByRuns() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (players[j].totalRuns < players[j + 1].totalRuns) {
                    Player temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }
            }
        }
        System.out.println("Players Sorted by Most Runs: ");
        for (int i = 0; i < count; i++) {
            System.out.println("Player: " + players[i].name + " | Total Runs: " + players[i].totalRuns);
        }
    }

    static void sortByWkts() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (players[j].totalWkts < players[j + 1].totalWkts) {
                    Player temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }
            }
        }
        System.out.println("Players Sorted by Most Wkts: ");
        for (int i = 0; i < count; i++) {
            System.out.println("Player: " + players[i].name + " | Total Wkts: " + players[i].totalWkts);
        }
    }

    static void updatePlayer() {
        String name;
        System.out.println("Player Name: ");
        boolean found = false;
        name = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (players[i].name.equalsIgnoreCase(name)) {
                found = true;
                System.out.println("Enter latest Runs: ");
                players[i].totalRuns = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter latest Wkts: ");
                players[i].totalWkts = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter latest Matches Played: ");
                players[i].matchesPlayed = sc.nextInt();
                sc.nextLine();
            }
            System.out.println("Player Updated Successfully!");
        }
        if(found==false){
            System.out.println("Player Not Found!");
        }
    }

    static void displayAll(){
        for(int i=0;i<count;i++){
            System.out.println("Player Name: "+players[i].name+"  ||  Jersey Number: "+players[i].jerseyNum+"  ||  Total Runs: "+players[i].totalRuns+"  ||  Total Wkts: "+players[i].totalWkts+"  ||  Matches Played: "+players[i].matchesPlayed);
        }
    }

    static boolean duplicateName(String name) {
        for (int i = 0; i < count; i++) {
            if (players[i].name.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=========Player Management System==========");

            System.out.println("1. Add Player");
            System.out.println("2. Remove Player");
            System.out.println("3. Search By Name");
            System.out.println("4. Search By Jersey Number");
            System.out.println("5. Sort By Most Runs");
            System.out.println("6. Sort By Most Wkts");
            System.out.println("7. Update Player");
            System.out.println("8. Display All");

            System.out.println("0. Exit");
            System.out.println("Enter Your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addPlayer();
                    break;
                case 2:
                    removePlayer();
                    break;
                case 3:
                    searchByName();
                    break;
                case 4:
                    searchByJNum();
                    break;
                case 5:
                    sortByRuns();
                    break;
                case 6:
                    sortByWkts();
                    break;
                case 7:
                    updatePlayer();
                    break;
                case 8:
                    displayAll();
                    break;
                case 0:
                    System.out.println("------EXITING-------");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 0);
    }
}