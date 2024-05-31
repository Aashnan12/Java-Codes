import prime_pack.*;
import java.util.Scanner;

public class Using_prime {
    public static void main(String args[]){
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime_package obj = new prime_package();
        if(obj.prime(n)){
            System.out.println("Prime");
        }
        else {
            System.out.println("Non Prime");
        }
    }
}
