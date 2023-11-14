package org.example;

import java.util.ArrayList;

public class Word extends SentencePart {
    private final ArrayList<Character> word = new ArrayList<>();

    Word(StringBuffer word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            this.word.add(ch);
        }
    }

    public int length() {
        return word.size();
    }

    public char getLetter(int n) {
        return word.get(n);
    }

    public boolean equals(Word word) {
        if (this.length() != word.length())
            return false;
        
        for (int i = 0; i < word.length(); i++)
            if (this.getLetter(i) != word.getLetter(i))
                return false;
        
        return true;
    }

    public void show() {
        for (Character character : word) {
            System.out.print(character.charValue());
        }
    }
}
