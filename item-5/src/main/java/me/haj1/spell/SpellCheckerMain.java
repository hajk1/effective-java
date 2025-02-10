package me.haj1.spell;

import me.haj1.mosaic.LegacyTileFactory;
import me.haj1.mosaic.Mosaic;
import me.haj1.mosaic.Tile;

/**
 * Demonstrates dependency injection and the use of a factory.
 */
public class SpellCheckerMain {
    public static void main(String[] args) {
        // --- Dependency Injection Example: SpellChecker ---
// Using the English lexicon
        Lexicon englishLexicon = new EnglishLexicon();
        SpellChecker englishSpellChecker = new SpellChecker(englishLexicon);
        System.out.println("English SpellChecker for 'example': " + englishSpellChecker.isValid("example"));
        System.out.println("Suggestions for 'exampel': " + englishSpellChecker.suggestions("exampel"));

        // Using the French lexicon
        Lexicon frenchLexicon = new FrenchLexicon();
        SpellChecker frenchSpellChecker = new SpellChecker(frenchLexicon);
        System.out.println("French SpellChecker for 'exemple': " + frenchSpellChecker.isValid("exemple"));
        System.out.println("Suggestions for 'exempel': " + frenchSpellChecker.suggestions("exempel"));
    }
}