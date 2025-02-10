package me.haj1.mosaic;

/**
 * A simple Tile class with a unique identifier.
 */
public class Tile {
    private static int counter = 0;
    private final int id;

    public Tile() {
        this.id = ++counter;
    }

    @Override
    public String toString() {
        return "Tile-" + id;
    }
}