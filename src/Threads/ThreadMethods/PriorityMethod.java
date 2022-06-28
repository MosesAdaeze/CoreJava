package Threads.ThreadMethods;

public class PriorityMethod implements Runnable{
    // Is Alive is used to check if it** alive.

    Thread thread; //Calling Thread

    PriorityMethod(int Priority) {
        thread = new Thread(this,"ChildThread");// Alive construct.
        thread.setPriority(Priority);
        System.out.println("Thread created: " + thread);
    }


    @Override
    public void run() {
        try{
            for (int i = 1; i <= 5; i++) {
                System.out.println(thread + "loop : " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            System.out.println("Thread : " + thread + " Interrupted");
        }
    }
}
