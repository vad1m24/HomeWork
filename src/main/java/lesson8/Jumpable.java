package lesson8;

public interface Jumpable {

    default boolean jumpable() {
        return true;
    }

}
