package org.example.bestpractices;

import java.util.Arrays;
import java.util.List;

public class StringManipulation {

    public String buildString(List<String> words) {

        String result = "";

        for (String word: words) {
            result+=word;

        }
        return result;
    }

    public static void main(String[] args) {
        StringManipulation stringManipulation = new StringManipulation();
        System.out.println(stringManipulation.buildString(Arrays.asList("a","b", "c")));
    }
}
