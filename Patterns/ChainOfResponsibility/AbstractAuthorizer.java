public abstract class AbstractAuthorizer{

    private AbstractAuthorizer nextAuthorizer;

    public AbstractAuthorizer(AbstractAuthorizer nextAuthorizer){
        this.nextAuthorizer = nextAuthorizer;
    }

    public boolean authorizeWithdrawal(Account account, int amount){
        if(nextAuthorizer != null){
            return nextAuthorizer.authorizeWithdrawal(account, amount);
        }
        
        else return false;
    }
}
