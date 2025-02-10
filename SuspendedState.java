public class SuspendedState implements AccountState{
    public void switchToActiveState(AccountStateController controller){
        controller.activate(new ActiveState());
    }
    public void switchToClosedState(AccountStateController controller){
        controller.close(new ClosedState());
    }



    public String getState(){
        return "Suspended";
    }
}