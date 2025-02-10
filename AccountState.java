public interface AccountState{
    public void switchState(AccountStateController controller);
    public String getState();
    public void deposit(Double depositAmount);
    public void withdraw(Double withdrawAmount);

}