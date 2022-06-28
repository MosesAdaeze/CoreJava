package Threads.SynchronizedKeyword.Example1;

import Threads.SynchronizedKeyword.SynchronizedMethodE;

public class Consumer extends Thread{
    SynchronizedMethodE synced;
    public Consumer (SynchronizedMethodE synced){
        this.synced = synced;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("Get called by consumer");
//            synced.getData();
        }
    }
}
