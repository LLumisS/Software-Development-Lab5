package org.example;

public class Punctuation extends SentencePart {
    private final char ch;

    // Punctuation constructor which takes StringBuffer chars
    Punctuation (StringBuffer ch) {
        this.ch = ch.charAt(0);
    }

    public void show() {
        System.out.print(ch);
    }
}
