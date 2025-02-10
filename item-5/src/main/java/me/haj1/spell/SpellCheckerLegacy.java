package me.haj1.spell;

import java.util.*;
import java.util.Objects;

/**
 * SpellChecker uses a Lexicon that is injected via its constructor.
 */
public class SpellCheckerLegacy {
  private final Lexicon dictionary = new EnglishLexicon();

    public SpellCheckerLegacy() {
    }

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return dictionary.getSimilarWords(typo);
    }
}
