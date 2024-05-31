import m2.*;
public class Result {
    public static void main(String[] args) {
        marks m = new marks();
        m.getmarks("Aashnan", 2021632,100 , 100, 100);
        m.printinfo();
        int a = m.a;
        int b = m.b;
        int c = m.c;
        float total = a+b+c;
        float avg = total/3;
        System.out.println(avg);
    }
}
