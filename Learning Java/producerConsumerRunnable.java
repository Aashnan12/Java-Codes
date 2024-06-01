class RationShop{
    boolean is_present = false;
    int item;
    synchronized void produce(int x){
        if(is_present){
            try{
                System.out.println("Producer is waiting for the consumer to consume");
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        item = x;
        System.out.println(item + " Item has been produced");
        is_present = true;
        notify();
    }
    
    synchronized void consume(){
        if(!is_present){
            try{
                System.out.println("Consumer is waiting for producer to produce");
                wait();
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(item + " Item has been Consumed");
        is_present = false;
        notify();
    }
}

class producer implements Runnable{
    RationShop obj;
    public void run(){
        for(int i=1;i<=10;i++){
            obj.produce(i);
        }
    }

    producer(RationShop obj){
        this.obj = obj;
    }
}

class consumer implements Runnable{
    RationShop obj;
    public void run(){
        for(int i=1;i<=10;i++){
            obj.consume();
        }
    }
    consumer(RationShop obj){
        this.obj = obj;
    }
}

public class producerConsumerRunnable {
    public static void main(String[] args) {
        RationShop rs = new RationShop();
        producer pr = new producer(rs);
        consumer cr = new consumer(rs);
        Thread t1 = new Thread(pr);
        Thread t2 = new Thread(cr);
        t1.start();
        t2.start();
    }
}
