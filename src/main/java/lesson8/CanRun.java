package lesson8;

public interface CanRun {

    default void run(Runnable runnable) {}

}
