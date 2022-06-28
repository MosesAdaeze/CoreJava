package Threads.SynchronizedKeyword.Example1;

import Threads.SynchronizedKeyword.SynchronizedMethodE;

public class Producer extends Thread{
    SynchronizedMethodE sycned;
    public Producer(SynchronizedMethodE synced){
        this.sycned = synced;
    }

    @Override
    public void run() {
        int data = 700;
        while (true){
            System.out.println("Put called by producer");
//            sycned.putData(data++);
        }
    }
}
