package Threads;

public class ThreadExample1 implements Runnable{
    @Override
    public void run() {
        System.out.println("As started running");
    }
    public void run2() {
        System.out.println("In it second running");
    }

    public static void main(String[] args) {
        ThreadExample1 obj = new ThreadExample1();
        Thread r = new Thread(obj);
        r.start();
    }

}
