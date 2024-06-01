public class Thread1 {
    public static void main(String[] args) {
        new A().start();
        new B().start();
        new C().start();
    }
}

class A extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Aashnan : " + i);
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Sneha : " + i);
        }
    }
}

class C extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Shubham : " + i);
        }
    }
}

