public class YellowConcreteState implements State {
    TrafficContext trafficContext;
    public YellowConcreteState(TrafficContext trafficContext) {
        this.trafficContext = trafficContext;
    }



    @Override
    public void handle() {
        System.out.println("Inside yellow");
        this.trafficContext.setState(new GreenConcreteState(trafficContext));
    }


}
