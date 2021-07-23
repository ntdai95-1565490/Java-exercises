public record Car(String name) {

    public String getName() {
        return name;
    }

    public void start() {
        System.out.println("Car started!");
    }
}
