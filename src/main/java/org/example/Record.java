package org.example;

public class Record {
    private final Word word;
    private int value;

    Record(Word word, int value) {
        this.word = word;
        this.value = value;
    }

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
