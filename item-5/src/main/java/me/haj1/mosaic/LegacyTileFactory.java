package me.haj1.mosaic;

import java.util.function.Supplier;

/**
 * A legacy tile factory implemented as a named class.
 * This factory creates new Tile instances.
 */
public class LegacyTileFactory implements Supplier<Tile> {
    @Override
    public Tile get() {
        return new Tile();
    }
}