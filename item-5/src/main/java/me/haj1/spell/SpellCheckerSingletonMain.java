package me.haj1.spell;

import static me.haj1.spell.SpellCheckerSingleton.INSTANCE;

/**
 * Demonstrates dependency injection and the use of a factory.
 */
public class SpellCheckerSingletonMain {
    public static void main(String[] args) {
        SpellCheckerSingleton spellChecker = INSTANCE;

        String word = "example";
        System.out.println("Is '" + word + "' valid? " + spellChecker.isValid(word));

        String typo = "exampel";
        System.out.println("Suggestions for '" + typo + "': " + spellChecker.suggestions(typo));
    }
}