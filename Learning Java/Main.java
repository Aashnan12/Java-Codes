class CustomUncheckedException extends RuntimeException {
    public CustomUncheckedException(String msg) {
        super(msg);
    }
}

class Base {
    public void perform() {
        throw new CustomUncheckedException("Custom unchecked exception occurred.");
    }
}

class Derived extends Base {
    public void call() {
        try {
            perform();
        } catch (CustomUncheckedException e) {
            System.out.println("Caught custom unchecked exception.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Derived obj = new Derived();
        obj.call();
    }
}
