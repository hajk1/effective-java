package me.haj1.spell;

import java.util.List;

/**
 * A simple interface for a dictionary.
 */
public interface Lexicon {
    boolean contains(String word);
    List<String> getSimilarWords(String typo);
}