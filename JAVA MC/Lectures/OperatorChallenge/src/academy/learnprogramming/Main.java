package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double myDouble1 = 20.00d;
        double myDouble2 = 80.00d;
        double result = (myDouble1 + myDouble2) * 100.00d;
        double remainder = result % 40.00d;
        boolean myBoolean = (remainder == 0) ? true : false;
        System.out.println(myBoolean);

        if (!myBoolean) {
            System.out.println("Get some remainder");
        }
    }
}
