package com.gildedrose;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] {
            new Item("foo", 0, 0),
            new Item("foo", 5, 0),
            new Item("foo", 10, 0),
            new Item("foo", 0, 5),
            new Item("foo", 5, 5),
            new Item("foo", 10, 5),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        Approvals.verifyAll("foo", Arrays.asList(items));
    }

    @Test
    void AgedBrie() {
        Item[] items = new Item[] {
            new Item("Aged Brie", 0, 0),
            new Item("Aged Brie", 5, 0),
            new Item("Aged Brie", 10, 0),
            new Item("Aged Brie", 0, 5),
            new Item("Aged Brie", 5, 5),
            new Item("Aged Brie", 10, 5),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        Approvals.verifyAll("foo", Arrays.asList(items));
    }

    @Test
    void SulfurasHadnOfRagnaros() {
        Item[] items = new Item[] {
            new Item("Sulfuras, Hand of Ragnaros", 0, 0),
            new Item("Sulfuras, Hand of Ragnaros", 5, 0),
            new Item("Sulfuras, Hand of Ragnaros", 10, 0),
            new Item("Sulfuras, Hand of Ragnaros", 0, 5),
            new Item("Sulfuras, Hand of Ragnaros", 5, 5),
            new Item("Sulfuras, Hand of Ragnaros", 10, 5),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        Approvals.verifyAll("foo", Arrays.asList(items));
    }

    @Test
    void BackstagePassesToATafkal80etcConcert() {
        Item[] items = new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 0),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 0),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 0),
            new Item("Backstage passes to a TAFKAL80ETC concert", 0, 5),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 5),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 5),
        };
        GildedRose app = new GildedRose(items);
        app.updateQuality();

        Approvals.verifyAll("foo", Arrays.asList(items));
    }

}
