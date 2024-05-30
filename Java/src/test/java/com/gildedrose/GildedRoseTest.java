package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.jupiter.api.Test;

class GildedRoseTest {

    @Test
    void updateItemQuality() {
        CombinationApprovals.verifyAllCombinations(
            (name, sellIn, quality) -> updateQuality(name, sellIn, quality).toString().trim(),
            new String[]{"foo", "Aged Brie", "Sulfuras, Hand of Ragnaros", "Backstage passes to a TAFKAL80ETC concert"}, // name
            new Integer[]{0, 5, 10, 100}, // sellIn
            new Integer[]{0, 5, 10, 50} // quality
        );
    }

    private static Item updateQuality(String name, int sellIn, int quality) {
        Item item = new Item(name, sellIn, quality);
        GildedRose app = new GildedRose(new Item[] { item });
        app.updateQuality();
        return item;
    }

}
