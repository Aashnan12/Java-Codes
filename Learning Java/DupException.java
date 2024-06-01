import java.util.*;

public class DupException {
    public static void main(String[] args) throws MyException {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int i=1;i<n;i++){
            if(arr[i] == arr[i-1]){
                throw new MyException("Duplicate no found");
            }
        }
    }
}

class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}