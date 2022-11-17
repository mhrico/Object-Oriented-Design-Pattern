public class Account {

    private String accName;
    private int balance;
    
    public Account(String accName, int balance) {
        this.accName = accName;
        this.balance = balance;
    }

    public String getAccName() {
        return accName;
    }


    public int getBalance() {
        return balance;
    }
    
    public void withdraw(int amount){
        System.out.println("Balance before withdrawal: " + getBalance());
        balance = balance - amount;
        System.out.println("Balance after withdrawal: " + getBalance());
    }

}