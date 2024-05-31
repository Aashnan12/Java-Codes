import packages.swap;
import java.util.Scanner;
public class using_Swap {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a + " " + b);
        swap obj = new swap();
        obj.swapno(a, b);
    }
}
