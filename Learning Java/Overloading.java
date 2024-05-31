class Calculator{
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int add(int a,int b){
        return a+b;
    }
}


public class Overloading {
    public static void main(String args[]){
        Calculator obj = new Calculator();
        System.out.println(obj.add(3,5,3));
        System.out.println(obj.add(5,2));
    }
}