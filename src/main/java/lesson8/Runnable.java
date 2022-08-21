package lesson8;

public interface Runnable {

    default boolean runnable() {
        return true;
    }

}
