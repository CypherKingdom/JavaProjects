package java_basics.chap7;

public class HandleException extends Exception{
    public HandleException(int num) {
        super(num + " is negative");
    }
}
