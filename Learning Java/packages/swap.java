package packages;

public class swap {
    public void swapno(int a,int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a + " " + b);
    }
}
