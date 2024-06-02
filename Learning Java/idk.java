class RationShop{
    int item;
    boolean is_present = false;

    synchronized void produce(int item){
        try{
            if(is_present){
                System.out.println("Producer is waiting for consumer to consume");
                wait();
            }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        this.item = item;
        System.out.println(item + " : Item has been produced");
        is_present = true;
        notify();
    }
    synchronized void consume(){
        try{
            if(!is_present){
                System.out.println("Consumer is waiting for producer to produce");
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

class producer extends Thread {
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
class consumer extends Thread {
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

public class idk {
    public static void main(String[] args) {
        RationShop obj = new RationShop();
        producer pr = new producer(obj);
        consumer cr = new consumer(obj);
        pr.start();
        cr.start();

    }
}
