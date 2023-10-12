package com.gildedrose;

import com.gildedrose.models.contracts.UpdatableItem;
import com.gildedrose.utils.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void gildedRoseWithItems1DayTest() {
        UpdatableItem[] items = TestUtils.getItemList();
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Aged Brie", app.items[0].getName());
        assertEquals(1, app.items[0].getSellIn());
        assertEquals(1, app.items[0].getQuality());
        assertEquals("Elixir of the Mongoose", app.items[1].getName());
        assertEquals(4, app.items[1].getSellIn());
        assertEquals(6, app.items[1].getQuality());
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[2].getName());
        assertEquals(0, app.items[2].getSellIn());
        assertEquals(80, app.items[2].getQuality());
        assertEquals("Legendary Backstage passes to a TAFKAL80ETC concert", app.items[3].getName());
        assertEquals(15, app.items[3].getSellIn());
        assertEquals(80, app.items[3].getQuality());
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[4].getName());
        assertEquals(14, app.items[4].getSellIn());
        assertEquals(21, app.items[4].getQuality());
    }

    @Test
    void gildedRoseWithItems10DaysTest() {
        UpdatableItem[] items = TestUtils.getItemList();
        GildedRose app = new GildedRose(items);

        for (int i = 0; i < 10; i++){
            app.updateQuality();
        }

        assertEquals("Aged Brie", app.items[0].getName());
        assertEquals(-8, app.items[0].getSellIn());
        assertEquals(18, app.items[0].getQuality());
        assertEquals("Elixir of the Mongoose", app.items[1].getName());
        assertEquals(-5, app.items[1].getSellIn());
        assertEquals(0, app.items[1].getQuality());
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[2].getName());
        assertEquals(0, app.items[2].getSellIn());
        assertEquals(80, app.items[2].getQuality());
        assertEquals("Legendary Backstage passes to a TAFKAL80ETC concert", app.items[3].getName());
        assertEquals(15, app.items[3].getSellIn());
        assertEquals(80, app.items[3].getQuality());
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[4].getName());
        assertEquals(5, app.items[4].getSellIn());
        assertEquals(37, app.items[4].getQuality());
    }

    @Test
    void gildedRoseWithItems30DaysTest() {
        UpdatableItem[] items = TestUtils.getItemList();
        GildedRose app = new GildedRose(items);

        for (int i = 0; i < 30; i++){
            app.updateQuality();
        }

        assertEquals("Aged Brie", app.items[0].getName());
        assertEquals(-28, app.items[0].getSellIn());
        assertEquals(50, app.items[0].getQuality());
        assertEquals("Elixir of the Mongoose", app.items[1].getName());
        assertEquals(-25, app.items[1].getSellIn());
        assertEquals(0, app.items[1].getQuality());
        assertEquals("Sulfuras, Hand of Ragnaros", app.items[2].getName());
        assertEquals(0, app.items[2].getSellIn());
        assertEquals(80, app.items[2].getQuality());
        assertEquals("Legendary Backstage passes to a TAFKAL80ETC concert", app.items[3].getName());
        assertEquals(15, app.items[3].getSellIn());
        assertEquals(80, app.items[3].getQuality());
        assertEquals("Backstage passes to a TAFKAL80ETC concert", app.items[4].getName());
        assertEquals(-15, app.items[4].getSellIn());
        assertEquals(0, app.items[4].getQuality());
    }

    @Test
    void gildedRoseWithConjuredItems1DayTest() {
        UpdatableItem[] items = TestUtils.getConjuredItemList();
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("Elixir of the Mongoose", app.items[0].getName());
        assertEquals(4, app.items[0].getSellIn());
        assertEquals(5, app.items[0].getQuality());
    }

    @Test
    void gildedRoseWithConjuredItems4DaysTest() {
        UpdatableItem[] items = TestUtils.getConjuredItemList();
        GildedRose app = new GildedRose(items);
        for(int i = 0; i < 4; i++){
            app.updateQuality();
        }
        assertEquals("Elixir of the Mongoose", app.items[0].getName());
        assertEquals(1, app.items[0].getSellIn());
        assertEquals(0, app.items[0].getQuality());
    }

    @Test
    void gildedRoseWithConjuredItems10DaysTest() {
        UpdatableItem[] items = TestUtils.getConjuredItemList();
        GildedRose app = new GildedRose(items);
        for(int i = 0; i < 10; i++){
            app.updateQuality();
        }
        assertEquals("Elixir of the Mongoose", app.items[0].getName());
        assertEquals(-5, app.items[0].getSellIn());
        assertEquals(0, app.items[0].getQuality());
    }
}
