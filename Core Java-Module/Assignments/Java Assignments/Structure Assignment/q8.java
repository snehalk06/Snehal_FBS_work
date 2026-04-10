class BankAccount{
    int accountNumber;
    String holderName;
    double currentBalance, interestRate;

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

public class q8{
    public static void main(String[] args) {

        BankAccount B1;
        B1=new BankAccount();

        B1.setAccountNumber(101);
        B1.setHolderName("Snehal");
        B1.setCurrentBalance(50000);
        B1.setInterestRate(5.5);

        
        B1.getAccountNumber();
        B1.getHolderName();
        B1.getCurrentBalance();
        B1.getInterestRate();

        
        B1.display();
    }
}