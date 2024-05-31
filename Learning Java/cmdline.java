public class cmdline {
    String name;
    int age;

    void getinfo(String name,int age){
        this.name = name;
        this.age = age;
    }
    void printinfo(){
        System.out.println(name + " " + age);
    }
    public static void main(String[] args) {
        cmdline arr[] = new cmdline[5];
        for(int i=0;i<10;i+=2){
            cmdline obj = new cmdline();
            obj.getinfo(args[i],Integer.parseInt(args[i+1]));
            arr[i/2] = obj;
        }
        for(int i=0;i<5;i++){
            arr[i].printinfo();
        }
    }
}
