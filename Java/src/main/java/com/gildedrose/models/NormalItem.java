package com.gildedrose.models;

import com.gildedrose.Item;
import com.gildedrose.models.contracts.UpdatableItem;

public class NormalItem implements UpdatableItem {
    private Item item;
    public NormalItem(Item item) {
        this.item = item;
    }

    @Override
    public String getName() {
        return item.name;
    }

    @Override
    public int getSellIn() {
        return item.sellIn;
    }

    @Override
    public int getQuality() {
        return item.quality;
    }

    @Override
    public void setName(String name) {
        item.name = name;
    }

    @Override
    public void setSellIn(int sellIn) {
        item.sellIn = sellIn;
    }

    @Override
    public void setQuality(int quality) {
        item.quality = quality;
    }

    public void updateQuality(){
        item.quality = Math.max( item.quality - 1, 0 );
    }

    @Override
    public void updateSellIn() {
        item.sellIn -= 1;
    }

    @Override
    public String toString() {
        return item.name + ", " + item.sellIn + ", " + item.quality;
    }
}
