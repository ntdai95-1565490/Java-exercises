package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        byte myByte = 100;
        short myShort = 1000;
        int myInt = 234;

        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        System.out.println(myLong);

        short mynewShort = (short) (1000 + 10 * (myByte + myShort + myInt));
        System.out.println(mynewShort);
    }
}