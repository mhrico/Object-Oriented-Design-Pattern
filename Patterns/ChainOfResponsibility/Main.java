public class Main{
    public static void main(String[] args) {

        Account account1 = new Account("Rico", 90_00_000);        
        AuthorizationChain authorizationChain = new AuthorizationChain();
        
        int smallAmount = 2_000;
        int mediumAmount = 20_000;
        int largeAmount = 20_00_000;
        int amount = largeAmount;

        boolean isAuthorized = authorizationChain.authorizeWithdrawal(account1, amount);

        if (isAuthorized) {
            account1.withdraw(amount);
        }
        else System.out.println("Error authorizing transaction!");

    }
}