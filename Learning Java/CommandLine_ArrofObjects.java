public class CommandLine_ArrofObjects {
    String name;
    int age;
    public void getinfo(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void display(){
        System.out.println(name + " " + age);
    }

    public static void main(String args[]){
        CommandLine_ArrofObjects arr[] = new CommandLine_ArrofObjects[5];
        for(int i=0;i<10;i+=2){
            int index = i/2;
            CommandLine_ArrofObjects obj = new CommandLine_ArrofObjects();
            obj.getinfo(args[i],Integer.parseInt(args[i+1]));
            arr[index] = obj;
        }
        for(int i=0;i<5;i++){
            arr[i].display();
        }
    }
}
