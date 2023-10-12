package com.gildedrose.utils;

import com.gildedrose.models.*;
import com.gildedrose.Item;
import com.gildedrose.models.contracts.UpdatableItem;

public class TestUtils {

    public static UpdatableItem[] getItemList(){
        return new UpdatableItem[] {
            new AgedItem(new NormalItem( new Item("Aged Brie", 2, 0))), //
            new NormalItem(new Item("Elixir of the Mongoose", 5, 7)), //
            new LegendaryItem(new NormalItem(new Item("Sulfuras, Hand of Ragnaros", 0, 80))),
            new LegendaryItem(new BackstageItem(new NormalItem(new Item("Legendary Backstage passes to a TAFKAL80ETC concert", 15, 49)))),
            new BackstageItem(new NormalItem(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)))
        };
    }

    public static UpdatableItem[] getConjuredItemList(){
        return new UpdatableItem[] {
            new ConjuredItem(new NormalItem(new Item("Elixir of the Mongoose", 5, 7)))
        };
    }
}
