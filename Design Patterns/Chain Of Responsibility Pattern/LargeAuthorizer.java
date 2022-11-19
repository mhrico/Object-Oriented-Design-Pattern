public class LargeAuthorizer extends AbstractAuthorizer {
    public LargeAuthorizer(AbstractAuthorizer nextAuthoizer){
        super(nextAuthoizer);
    }

    public boolean authorizeWithdrawal(Account account, int amount) {
        System.out.println("Authorization by manager");
        if(amount >= 10_00_000){
            return true;
        }
        else {
            return super.authorizeWithdrawal(account, amount);
        }
    }

    
}
