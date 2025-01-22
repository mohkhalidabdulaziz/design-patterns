package org.example.bestpractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ConcurrentModificationExceptionExample {

    private static void concurrentModificationException() {
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("a", "b", "c", "d")
        );

        words.removeIf(word -> word.equals("a"));
    }

    public static void main(String[] args) {
        concurrentModificationException();
    }
}
