package org.example;

import java.util.ArrayList;

public class Text {
    private final ArrayList<Sentence> sentences = new ArrayList<>();

    Text (StringBuffer text) {
        ArrayList<Integer> separators = new ArrayList<>();

        separators.add(0);
        for (int i = 0; i < text.length() - 1; i++) {
            char ch = text.charAt(i);
            if ((ch == '.' || ch == '!' || ch == '?') && text.charAt(i + 1) == ' ') {
                separators.add(i + 2);
            }
        }
        separators.add(text.length());

        for (int i = 0; i < separators.size() - 1; i++) {
            int pos1 = separators.get(i);
            int pos2 = Math.min(separators.get(i + 1), text.length());
            StringBuffer sbSentence = new StringBuffer(text.substring(pos1, pos2));
            Sentence sentence = new Sentence(sbSentence);
            sentences.add(sentence);
            System.out.println();
            sentence.show();
        }
    }

    public int length() {
        return sentences.size();
    }

    public ArrayList<Sentence> getSentences() {
        return sentences;
    }

    public void show() {
        for (Sentence sentence : sentences) {
            sentence.show();
        }
    }
}
