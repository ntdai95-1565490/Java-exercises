public class App {

    public static void main(String[] args) {

        String[] texts = {"one", "two", "three"};

        try {
            System.out.println(texts[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }
}
