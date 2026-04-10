class BankAccount{
    int accountNumber;
    String holderName;
    double currentBalance, interestRate;

     BankAccount() {
        this.accountNumber=101;
        this.holderName="Pratik";
        this.currentBalance=759854;
        this.interestRate=898547;
    }

    public BankAccount(int accountNumber, String holderName, double currentBalance, double interestRate) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.currentBalance = currentBalance;
        this.interestRate = interestRate;
    }

    









    

    void setAccountNumber(int a)
    {
        this.accountNumber=a;
    }

    void setHolderName(String name)
    {
        this.holderName=name;
    }

    void setCurrentBalance(double b)
    {
        this.currentBalance=b;
    }

    void setInterestRate(double r)
    {
        this.interestRate=r;
    }

    int getAccountNumber()
    {
        return this.accountNumber;
    }

    String getHolderName()
    {
        return this.holderName;
    }

    double getCurrentBalance()
    {
        return this.currentBalance;
    }

    double getInterestRate()
    {
        return this.interestRate;
    }

    void display()
    {
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Holder Name : " + this.holderName);
        System.out.println("Current Balance : " + this.currentBalance);
        System.out.println("Interest Rate : " + this.interestRate);
    }
}

public class TestBankacc{
    public static void main(String[] args) {

        BankAccount B1,B2;

        B1=new BankAccount();

        B2=new BankAccount(102,"pratik",897547,10);
        B1.setAccountNumber(101);
        B1.setHolderName("Snehal");
        B1.setCurrentBalance(50000);
        B1.setInterestRate(5.5);

        
        B1.getAccountNumber();
        B1.getHolderName();
        B1.getCurrentBalance();
        B1.getInterestRate();

        
        B1.display();
        B2.display();
    }
}