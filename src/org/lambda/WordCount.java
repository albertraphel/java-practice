package org.lambda;

import org.lambda.interfaces.WordCounter;

public class WordCount {
    public static void main(String[] args) {
        String str = "This is a test string";

        WordCounter wordCounter = (s) -> s.split(" ").length;
        System.out.println(wordCounter.count(str));
    }
}
