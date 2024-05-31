package m1;

public class Student {
    int id;
    String name;
    public void getInfo(int id,String name){
        this.id = id;
        this.name = name;
    }
    public void printinfo(){
        System.out.println(name + " " + id);
    }
}
