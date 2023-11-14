package org.example;

import java.util.ArrayList;

public class Table {
    private final ArrayList<Record> table = new ArrayList<>();

    public int getMax() {
        int max = 1;
        for (Record record : table)
            if (record.getValue() > max)
                max = record.getValue();
        return max;
    }

    public void addRecord(Word word) {
        for (Record record : table) {
            if(record.getField().equals(word)) {
                record.incValue();
            }}
        table.add(new Record(word, 1));
    }
}
