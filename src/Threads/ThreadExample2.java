package Threads;

public class ThreadExample2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Currently executing thread is: "
        + Thread.currentThread().getName());

        System.out.println("Does thread holds lock? " + Thread.holdsLock(this));
        synchronized (this) {
            System.out.println("Does thread holds lock? " + Thread.holdsLock(this));
        }
    }

    public static void main(String[] args) {
        System.out.println("Currently executing thread is: " + Thread.currentThread().getName());
        ThreadExample2 g1 = new ThreadExample2();
        Thread thread1 = new Thread(g1);
        thread1.start();

    }
}
