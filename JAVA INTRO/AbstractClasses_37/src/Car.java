public class Car extends Machine {

    @Override
    public void start() {
        System.out.println("Starting car.");
    }

    @Override
    public void doStuff() {
        System.out.println("Do stuff in car.");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutdown car.");
    }

}
