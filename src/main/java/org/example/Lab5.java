package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("Enter text:");
                StringBuffer sbText = new StringBuffer(scanner.nextLine());

                if (sbText.isEmpty()) {
                    throw new IllegalArgumentException();
                }

                Text text = new Text(sbText);
                int result = Calculate(text);

                if (result == 0) {
                    throw new IllegalArgumentException();
                }

                System.out.println("\nResult: " + result + "\n");
                scanner.close();
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("\nError: Input Mismatch.\n");
            }
        }
    }

    private static int Calculate(Text text) {
        Table wordCount = new Table();
        ArrayList<Sentence> sentences = text.getSentences();
        for (Sentence sentence : sentences) {
            ArrayList<Word> words = sentence.getWords();
            ArrayList <Word> allWords = new ArrayList<>();
            for (Word word : words)
                if (!isFound(allWords, word)) {
                    allWords.add(word);
                    wordCount.addRecord(word);
                }
        }
        return wordCount.getMax();
    }

    private static boolean isFound(ArrayList<Word> allWords, Word word) {
        for (Word element : allWords)
            if (element.equals(word))
                return true;
        return false;
    }
}