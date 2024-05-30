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

}
