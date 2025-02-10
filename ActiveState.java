public class ActiveState implements AccountState{
    public void suspend(AccountStateController controller){
        controller.setState(new SuspendedState());
    }
    public void close(AccountStateController controller){
        controller.setState(new ClosedState());
    }
    public String getState(){
        return "Active";
    }
    public void deposit(Double depositAmount){

    }
    public void withdraw(Double withdrawAmount){

    }
}