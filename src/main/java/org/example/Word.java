package org.example;

import java.util.ArrayList;

public class Word extends SentencePart {
    private final ArrayList<Letter> word = new ArrayList<>();

    // Word constructor which takes StringBuffer word
    Word(StringBuffer word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            this.word.add(new Letter(ch));
        }
    }

    public int length() {
        return word.size();
    }

    public char getLetter(int n) {
        return word.get(n).getLetter();
    }

    // if the getted word is equal to the base word
    public boolean equals(Word word) {
        if (this.length() != word.length())
            return false;
        
        for (int i = 0; i < word.length(); i++)
            if (this.getLetter(i) != word.getLetter(i))
                return false;
        
        return true;
    }

    public void show() {
        for (Letter letter : word) {
            System.out.print(letter.getLetter());
        }
    }
}
