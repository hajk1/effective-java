package me.haj1.spell;

import java.util.*;
import java.util.Objects;

/**
 * SpellChecker uses a Lexicon that is injected via its constructor.
 */
public class SpellChecker {
    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary, "Dictionary cannot be null");
    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return dictionary.getSimilarWords(typo);
    }
}
