package org.example.bestpractices;

import java.util.ArrayList;
import java.util.Arrays;

public class ConcurrentModificationExceptionExample {

    private static void concurrentModificationException() {
        ArrayList<String> words = new ArrayList<>(
                Arrays.asList("a", "b", "c", "d")
        );
        for (String word: words) {
            if (word.equals("a")) {
                words.remove(word);
            }
        }
    }

    public static void main(String[] args) {
        concurrentModificationException();
    }
}
