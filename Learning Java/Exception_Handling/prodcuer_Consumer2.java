class RationShop{
    int item;
    boolean is_present = false;
    synchronized void produce(int x){
        try{
            if(is_present){
                System.out.println("Producer is waiting for consumer to consume the item");
                wait();
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        item = x;
        System.out.println(item + " : Item has been produced");
        is_present = true;
        notify();
    }
    synchronized void consume(){
        try{
            if(!is_present){
                System.out.println("Consumer is waiting for producer to produce the item");
                wait();
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(item + " : Item has been Consumed");
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

public class prodcuer_Consumer2 {
    public static void main(String[] args) {
        RationShop obj = new RationShop();
        producer pr = new producer(obj);
        consumer cr = new consumer(obj);
        Thread t1 = new Thread(pr);
        Thread t2 = new Thread(cr);
        t1.start();
        t2.start();
    }
}
