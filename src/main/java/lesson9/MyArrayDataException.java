package lesson9;

public class MyArrayDataException extends Throwable {

    String message;

    public MyArrayDataException(String message) {
        super(message);
        this.message = message;
    }
}
