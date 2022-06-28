package Threads.SynchronizedKeyword.Example2;

public class Consumer implements Runnable{
    SynchronizedMethod synced;
    public Consumer (SynchronizedMethod synced){
        this.synced = synced;
        new Thread(this, "Consumer").start();

        System.out.println("Get called Consumer");
    }

    @Override
    public void run() {
        while (true){
            synced.getData();
        }
    }
}
