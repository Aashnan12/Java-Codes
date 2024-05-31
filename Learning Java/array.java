import java.util.*;
public class array {
    public static void main(String args[]){
        // int nums[] = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(num[i]*num[i] + " ");
        }
    }
}
