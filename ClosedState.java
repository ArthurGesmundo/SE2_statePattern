public class ClosedState implements AccountState{
    /*public void switchState(TrafficLightController controller){
        controller.setState(new ClosedState());
    }*/

    public String getState(){
        return "Closed";
    }
}