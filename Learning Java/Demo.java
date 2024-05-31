class calculator{
    public int add(){
        System.out.println("Function Add");
        return 0;
    }
}

class Computer{

    public void playMusic(){
        System.out.println("Playing Music");
    }
    public String getMePen(int cost){
        return cost >= 10?"Pen":"No Pen";
    }
}

public class Demo{
    public static void main(String args[]){
        
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMePen(9);
        System.out.println(str); 
    }
}