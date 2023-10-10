package com.gildedrose.models.contracts;

import com.gildedrose.Item;

public abstract class UpdatableItem extends Item {

    public UpdatableItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public abstract void updateQuality();
}
