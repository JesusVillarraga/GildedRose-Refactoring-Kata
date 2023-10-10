package com.gildedrose;

import com.gildedrose.utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void gildedRoseWithItems1DayTest() {
        Item[] items = TestUtils.getItemList();
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
        assertEquals("Elixir of the Mongoose", app.items[1].name);
        assertEquals(4, app.items[1].sellIn);
        assertEquals(6, app.items[1].quality);
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[2].name);
        assertEquals(0, app.items[2].sellIn);
        assertEquals(80, app.items[2].quality);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[3].name);
        assertEquals(14, app.items[3].sellIn);
        assertEquals(50, app.items[3].quality);
    }

    @Test
    void gildedRoseWithItems10DaysTest() {
        Item[] items = TestUtils.getItemList();
        GildedRose app = new GildedRose(items);

        for (int i = 0; i < 10; i++){
            app.updateQuality();
        }

        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-8, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
        assertEquals("Elixir of the Mongoose", app.items[1].name);
        assertEquals(-5, app.items[1].sellIn);
        assertEquals(0, app.items[1].quality);
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[2].name);
        assertEquals(0, app.items[2].sellIn);
        assertEquals(80, app.items[2].quality);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[3].name);
        assertEquals(5, app.items[3].sellIn);
        assertEquals(50, app.items[3].quality);
    }

    @Test
    void gildedRoseWithItems30DaysTest() {
        Item[] items = TestUtils.getItemList();
        GildedRose app = new GildedRose(items);

        for (int i = 0; i < 30; i++){
            app.updateQuality();
        }

        assertEquals("Aged Brie", app.items[0].name);
        assertEquals(-28, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
        assertEquals("Elixir of the Mongoose", app.items[1].name);
        assertEquals(-25, app.items[1].sellIn);
        assertEquals(0, app.items[1].quality);
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[2].name);
        assertEquals(0, app.items[2].sellIn);
        assertEquals(80, app.items[2].quality);
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[3].name);
        assertEquals(-15, app.items[3].sellIn);
        assertEquals(0, app.items[3].quality);
    }

    @Test
    void gildedRoseWithConjuredItems1DayTest() {
        Item[] items = TestUtils.getConjuredItemList();
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Elixir of the Mongoose", app.items[0].name);
        assertEquals(4, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
    }

    @Test
    void gildedRoseWithConjuredItems4DaysTest() {
        Item[] items = TestUtils.getConjuredItemList();
        GildedRose app = new GildedRose(items);
        for(int i = 0; i < 4; i++){
            app.updateQuality();
        }
        assertEquals("Elixir of the Mongoose", app.items[0].name);
        assertEquals(1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void gildedRoseWithConjuredItems10DaysTest() {
        Item[] items = TestUtils.getConjuredItemList();
        GildedRose app = new GildedRose(items);
        for(int i = 0; i < 10; i++){
            app.updateQuality();
        }
        assertEquals("Elixir of the Mongoose", app.items[0].name);
        assertEquals(-5, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }
}
