import java.util.*;
public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        try{
            if(age > 12){
                throw new MyException("You are not Safe. Stay Alert!");
            }
            System.out.println("You are safe");
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}

class MyException extends Exception{
    MyException(String s){
        super(s);
    }
}
