package com.gildedrose.models;

import com.gildedrose.models.contracts.UpdatableItem;

public class NormalItem extends UpdatableItem {
    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality(){
        this.quality = Math.max( quality - 1, 0 );
        this.updateSellIn();
    }

    private void updateSellIn(){
        this.sellIn -= 1;
    }
}
