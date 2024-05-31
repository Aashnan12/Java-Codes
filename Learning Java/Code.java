class Code {
    int a;
    static int x;
    static{
        x = 10;
    }
    void setvalue(int a){
        this.a = a;
    }
    void printvalue(){
        System.out.println(x);
        System.out.println(a);
        a++;
        x++;
    }
    public static void main(String[] args) {
        Code obj1 = new Code();
        Code obj2 = new Code();
        obj1.setvalue(20);
        obj2.setvalue(30);
        obj1.printvalue();
        obj2.printvalue();
        obj1.printvalue();
        obj2.printvalue();
        obj1.printvalue();
        obj2.printvalue();
    }
}