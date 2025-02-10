package me.haj1.spell;

import java.util.List;

// Inappropriate use of singleton - inflexible & untestable!
public class SpellCheckerSingleton {
    private final Lexicon dictionary = new EnglishLexicon();

    private SpellCheckerSingleton() {}

    public static final SpellCheckerSingleton INSTANCE = new SpellCheckerSingleton();

    public boolean isValid(String word) {
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        return dictionary.getSimilarWords(typo);
    }
}