package lesson10;

import java.util.Arrays;
import java.util.Collections;

public class ArrayElements {

    public static void main(String[] args) {

        String[] elements = new String[]{"a", "c", "b", "d"};

        Collections.swap(Arrays.asList(elements), 1, 2);
        System.out.println(Arrays.toString(elements));

    }
}
