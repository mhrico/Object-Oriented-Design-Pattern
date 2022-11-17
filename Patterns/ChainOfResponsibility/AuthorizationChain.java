public class AuthorizationChain {
    AbstractAuthorizer chain;

    public AuthorizationChain(){
        buildChain();
    }

    private void buildChain() {
        chain = new SmallAuthorizer(new MediumAuthorizer(new LargeAuthorizer(null)));
    }

    public boolean authorizeWithdrawal(Account account, int amount){
        return chain.authorizeWithdrawal(account, amount);
    }
}
