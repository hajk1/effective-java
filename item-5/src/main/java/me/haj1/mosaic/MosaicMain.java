package me.haj1.mosaic;

public class MosaicMain {
public static void main(String[] args){
    // --- Factory Example: Creating a Mosaic with Tiles ---
    // Using Java 8 method reference to create new Tiles
    Mosaic mosaic = Mosaic.create(Tile::new, 5);
//        Mosaic mosaic = Mosaic.create(new Supplier<Tile>() {
//            @Override
//            public Tile get() {
//                return new Tile();
//            }
//        }, 5);
    System.out.println(mosaic);
    // --- Factory Example: Creating a Mosaic with Tiles using a named legacy tile factory ---
    LegacyTileFactory tileFactory = new LegacyTileFactory();
    mosaic = Mosaic.create(tileFactory, 6);
    System.out.println(mosaic);

}
}