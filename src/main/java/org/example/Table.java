package org.example;

import java.util.ArrayList;

public class Table {
    // array of records
    private final ArrayList<Record> table = new ArrayList<>();

    // get the record with maximum count
    public int getMax() {
        int max = 0;
        for (Record record : table)
            if (record.getValue() > max)
                max = record.getValue();
        return max;
    }

    public void addRecord(Word word) {
        for (Record record : table) {
            /* 
             * if the word is already recorded,
             * increase the count by 1
             */
            if(record.getField().equals(word)) {
                record.incValue();
                return;
            }
        }
        // else add a new record
        table.add(new Record(word));
    }
}
