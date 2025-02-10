public class AccountStateController{
    private AccountState state;

    //default state
    public AccountStateController(){
        state = new ActiveState();
    }

    public AccountState getState() {
        return state;
    }

    public void setState(AccountState state) {
        this.state = state;
    }

}