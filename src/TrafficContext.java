//context - holds the reference of current state

/*
Behavioural Design pattern:
        State Design Pattern : The main purpose of the State Design Pattern is to allow an object to change its behavior when its internal state changes. This pattern helps in avoiding complex conditional statements by encapsulating state-specific behavior into separate classes.
*/
public class TrafficContext {
    State state;

    TrafficContext() {
        this.state = new RedConcreteState(this);
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handleState() {
        this.state.handle();
    }
}
