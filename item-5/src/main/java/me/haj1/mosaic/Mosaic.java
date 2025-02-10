package me.haj1.mosaic;

import java.util.*;
import java.util.function.Supplier;

/**
 * Mosaic is composed of Tiles. It uses a Supplier factory to create each Tile.
 */
public class Mosaic {
    private final List<Tile> tiles;

    public Mosaic(List<Tile> tiles) {
        this.tiles = tiles;
    }

    /**
     * Creates a Mosaic using the provided tile factory (Supplier) and number of tiles.
     */
    public static Mosaic create(Supplier<? extends Tile> tileFactory, int numTiles) {
        List<Tile> tiles = new ArrayList<>();
        for (int i = 0; i < numTiles; i++) {
            tiles.add(tileFactory.get());
        }
        return new Mosaic(tiles);
    }

    @Override
    public String toString() {
        return "Mosaic with tiles: " + tiles;
    }
}