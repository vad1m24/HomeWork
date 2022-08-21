package lesson9;

public class MyArraySizeException extends Throwable {

    String message;

    public MyArraySizeException(String message) {
        super(message);
        this.message = message;
    }
}
