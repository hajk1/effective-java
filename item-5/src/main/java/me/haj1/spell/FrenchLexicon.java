package me.haj1.spell;

import java.util.*;

/**
 * A simple French dictionary implementation of the Lexicon interface.
 */
public class FrenchLexicon implements Lexicon {
    private final Set<String> words;

    public FrenchLexicon() {
        // A fixed set of French words for demonstration purposes.
        words = new HashSet<>(Arrays.asList(
            "bonjour", "monde", "exemple", "dépendance", "injection", "test"
        ));
    }

    @Override
    public boolean contains(String word) {
        return words.contains(word.toLowerCase());
    }

    @Override
    public List<String> getSimilarWords(String typo) {
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
