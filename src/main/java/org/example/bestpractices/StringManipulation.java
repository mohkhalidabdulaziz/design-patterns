package org.example.bestpractices;

import java.util.Arrays;
import java.util.List;

public class StringManipulation {

    public String buildString(List<String> words) {

        StringBuilder stringBuilder = new StringBuilder();

        for (String word: words) {
            stringBuilder.append(word);

        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        StringManipulation stringManipulation = new StringManipulation();
        System.out.println(stringManipulation.buildString(Arrays.asList("a","b", "c")));
    }
}
