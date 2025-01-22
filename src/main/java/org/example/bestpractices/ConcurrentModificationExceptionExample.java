package org.example.bestpractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ConcurrentModificationExceptionExample {

    private static void concurrentModificationException() {
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("a", "b", "c", "d")
        );

        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.equals("a")) {
               iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        concurrentModificationException();
    }
}
