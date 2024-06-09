public class GreenConcreteState implements State{
    TrafficContext trafficContext;
    public GreenConcreteState(TrafficContext trafficContext) {
        this.trafficContext=trafficContext;
    }


    @Override
    public void handle() {
        System.out.println("Inside green");
        this.trafficContext.setState(new RedConcreteState(trafficContext));
    }
}
