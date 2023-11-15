package org.example;

public class Record {
    private final Word word;
    private int value;

    // Record constructor which takes the word
    Record(Word word) {
        this.word = word;
        this.value = 1;
    }

    // increase word amount by 1
    public void incValue() {
        value++;
    }

    public Word getField() {
        return word;
    }

    public int getValue() {
        return value;
    }
}
