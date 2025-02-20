class CurrentAccount{
    private String accountNum;
    private float balance;

    CurrentAccount(){
        this.accountNum = "00000000";
        this.balance = 0.00f;
    }
    CurrentAccount(String accountNum, float balance){
        this.accountNum = accountNum;
        this.balance = balance;
    }
    public void deposit(float amount){
        this.balance += amount;
        System.out.println("Successfully deposited" + amount);
    }
    public void withdraw(float amount){
        if(amount > this.balance){
            System.out.println("Insufficient funds...");
        }
        else{
            this.balance -= amount;
        }
    }
    public float getBalance(String accountNum){
        return balance;
    }
}

class SavingsAccount extends CurrentAccount{
    private float interestRate;
    SavingsAccount(){
        super();
        this.interestRate = 4.35f;
    }
    SavingsAccount(String accountNum, float amount){
        super();
        this.interestRate = 4.35f;
    }
    @Override
    public void withdraw(float amount){
        if(amount > getBalance("00000000") - 2000){
            System.out.println("Insufficient funds!!! Minimum balance required...");
        }
        else{
            super.withdraw(amount);
        }
    }
}

class BankAccount{
    public static void main(String a[]){
        CurrentAccount user1 = new CurrentAccount();

        SavingsAccount user2 = new SavingsAccount();
        user2.deposit(3500);
        user2.withdraw(3000);

        CurrentAccount user3 = new CurrentAccount("87654321", 6800);

        System.out.println(user1.getBalance("00000000"));
        System.out.println(user2.getBalance("12345678"));
        System.out.println(user3.getBalance("87654321"));
    }
}