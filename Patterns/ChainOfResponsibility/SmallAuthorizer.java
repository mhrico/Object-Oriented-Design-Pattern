public class SmallAuthorizer extends AbstractAuthorizer {
    public SmallAuthorizer(AbstractAuthorizer nextAuthoizer){
        super(nextAuthoizer);
    }

    public boolean authorizeWithdrawal(Account account, int amount) {
        System.out.println("Authorization by cashier");
        if(amount < 10_000){
            return true;
        }
        else {
            return super.authorizeWithdrawal(account, amount);
        }
    }

    
}
