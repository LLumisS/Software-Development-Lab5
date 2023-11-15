package org.example;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
    private final ArrayList<SentencePart> elements = new ArrayList<>();

    // Sentence constructor which takes StringBuffer sentence
    Sentence (StringBuffer sbSentence) {
        // regexp which splits sentence into words, spaces and punctuation marks
        Pattern WORD_PATTERN = Pattern.compile("\\b\\w+\\b|\\s+|\\p{Punct}");
        ArrayList<StringBuffer> elements = new ArrayList<>();
        Matcher matcher = WORD_PATTERN.matcher(sbSentence);

        while (matcher.find()) {
            StringBuffer element = new StringBuffer(matcher.group());
            elements.add(element);
        }

        for (StringBuffer element : elements) {
            if (!element.toString().isEmpty()) {
                // creating correct instances for every element
                if (Character.isLetter(element.charAt(0))) {
                    this.elements.add(new Word(element));
                } else {
                    this.elements.add(new Punctuation(element));
                }
            }
        }
    }

    public void show() {
        for (SentencePart element : elements) {
            element.show();
        }
    }

    // get only the Word elements
    public ArrayList<Word> getWords() {
        ArrayList<Word> result = new ArrayList<>();
        
        for (SentencePart element : elements) {
            if (element instanceof Word current) {
                result.add(current);
            }
        }

        return result;
    }
}
