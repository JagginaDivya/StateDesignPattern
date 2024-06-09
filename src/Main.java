public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        TrafficContext context = new TrafficContext();

        context.handleState(); //red - yellow
        context.handleState(); //yellow - green
        context.handleState(); //green- red
    }
}