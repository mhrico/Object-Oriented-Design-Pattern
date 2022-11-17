public class MediumAuthorizer extends AbstractAuthorizer {
    public MediumAuthorizer(AbstractAuthorizer nextAuthoizer){
        super(nextAuthoizer);
    }

    public boolean authorizeWithdrawal(Account account, int amount) {
        System.out.println("Authorization by senior officer");
        if(amount >= 10_000 && amount < 10_00_000){
            return true;
        }
        else {
            return super.authorizeWithdrawal(account, amount);
        }
    }

    
}
