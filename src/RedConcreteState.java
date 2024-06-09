public class RedConcreteState implements State {
    TrafficContext trafficContext;
    public RedConcreteState(TrafficContext trafficContext) {
        this.trafficContext=trafficContext;
    }

    @Override
    public void handle() {
        System.out.println("Inside red");
         this.trafficContext.setState(new YellowConcreteState(trafficContext));
    }


}
