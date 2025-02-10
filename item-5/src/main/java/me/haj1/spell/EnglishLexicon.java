package me.haj1.spell;

import java.util.*;

/**
 * A simple English dictionary implementation of Lexicon.
 */
public class EnglishLexicon implements Lexicon {
    private final Set<String> words;

    public EnglishLexicon() {
        // A fixed set of words for demonstration purposes.
        words = new HashSet<>(Arrays.asList("hello", "world", "example", "java", "dependency", "injection", "test"));
    }

    @Override
    public boolean contains(String word) {
        return words.contains(word.toLowerCase());
    }

    @Override
    public List<String> getSimilarWords(String typo) {
        // For simplicity, return words that start with the same letter as the typo.
        List<String> suggestions = new ArrayList<>();
        if (typo == null || typo.isEmpty()) {
            return suggestions;
        }
        char firstLetter = Character.toLowerCase(typo.charAt(0));
        for (String word : words) {
            if (word.charAt(0) == firstLetter) {
                suggestions.add(word);
            }
        }
        return suggestions;
    }
}