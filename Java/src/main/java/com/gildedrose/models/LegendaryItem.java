package com.gildedrose.models;

import com.gildedrose.models.contracts.UpdatableItem;

public class LegendaryItem extends UpdatableItem {
    public LegendaryItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality(){
        this.quality = 80;
    }
}
