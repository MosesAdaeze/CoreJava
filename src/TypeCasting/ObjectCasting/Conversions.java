package TypeCasting.ObjectCasting;

public class Conversions {
    public static void main(String[] args) {
        byte x;
        int a = 270;
        double b = 128.128;
        x = (byte) a;
        System.out.println("a and x " + a + " " + x);
        a = (int) b;
        System.out.println("a and x " + b + " " + a);
        x = (byte) b;
        System.out.println("a and x " + b + " " + x);
    }
}
//checking if the input number from user is even of odd, prime.