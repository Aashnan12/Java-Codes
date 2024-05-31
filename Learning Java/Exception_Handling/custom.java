class MyException extends Exception{
    MyException(String str){
        super(str);
    }
}


public class custom {
    public static void main(String[] args){
        String str = null;
        try{
            if(str == null){
                throw new MyException("String is Empty");
            }
            int len = str.length();
        }
        catch(MyException e){
            System.out.println("Something went wrong...");
        }
        System.out.println("Bye");
    }
}