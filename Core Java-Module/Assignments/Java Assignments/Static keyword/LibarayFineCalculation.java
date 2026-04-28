class LibraryUser{
    String userName;
    int noofdaysbooklate;
    static double finechargedperday=10;


    public LibraryUser(String username,int noofdaysbooklate)
    {
        this.userName=username;
        this.noofdaysbooklate=noofdaysbooklate;

    }
    static void updateFinechargedperday(double finechargedperday)
    {
        LibraryUser.finechargedperday = finechargedperday;
    }
     // Method to calculate total fine
    double calculateFine() {
        return noofdaysbooklate * finechargedperday;
    }

    // Display method
    void displayUser() {
        System.out.println("User Name: " + userName);
        System.out.println("Days Late: " + noofdaysbooklate);
        System.out.println("Fine per Day: " + finechargedperday);
        System.out.println("Total Fine: " + calculateFine());
        System.out.println("-------------------------");
    }


}

public class LibarayFineCalculation {
    public static void main(String[] args) {
        LibraryUser l1=new LibraryUser("Snehal", 10);
        LibraryUser l2=new LibraryUser("Prarik", 20);
        
        l1.displayUser();
        l2.displayUser();

        System.out.println("After update fine");
        LibraryUser.updateFinechargedperday(20);
        l1.displayUser();
        l2.displayUser();
    }
    
}
