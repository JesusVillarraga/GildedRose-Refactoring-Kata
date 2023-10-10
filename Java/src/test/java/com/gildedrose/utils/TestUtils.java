package com.gildedrose.utils;

import com.gildedrose.models.*;
import com.gildedrose.Item;

public class TestUtils {

    public static Item[] getItemList(){
        return new Item[] {
            new AgedItem("Aged Brie", 2, 0), //
            new NormalItem("Elixir of the Mongoose", 5, 7), //
            new LegendaryItem("Sulfuras, Hand of Ragnaros", 0, 80),
            new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 15, 49)};
    }

    public static Item[] getConjuredItemList(){
        return new Item[] {
            new ConjuredItem("Elixir of the Mongoose", 5, 7)};
    }
}
