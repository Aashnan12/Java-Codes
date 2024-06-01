public class SharedCounter {
    public static void main(String[] args) {
        Counter obj = new Counter();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        t1.start();
        t2.start();
    }
}

class Counter implements Runnable{
    int count = 0;
    public void run(){
        for(int i=1;i<=10;i++){
            increment();
        }
    }

    synchronized void increment(){
        count++;
        System.out.println(Thread.currentThread().getName() +"  "+ count);
    }
}


