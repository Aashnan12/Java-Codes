class Calc{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int sub(int n1,int n2){
        return n1-n2;
    }
}

class AdvCalc extends Calc{
    public int Mul(int n1,int n2){
        return n1*n2;
    }
    public int Div(int n1,int n2){
        return n1/n2;
    }
}

class VeryAdvCalc extends AdvCalc{
    public double power(int n1,int n2){
        return Math.pow(n1,n2);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int a = obj.add(4,3);
        int b = obj.sub(4,3);
        int c = obj.Mul(4,3);
        int d = obj.Div(4,3);
        double e = obj.power(4,4);
        System.out.println(a + " " + b + " " + c + " " + d + " "+ e);
    }
}