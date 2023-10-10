package com.gildedrose.models;

import com.gildedrose.models.contracts.UpdatableItem;

public class ConjuredItem extends UpdatableItem {

    public ConjuredItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality(){
        this.quality = Math.max( quality - 2, 0 );
        this.updateSellIn();
    }

    private void updateSellIn(){
        this.sellIn -= 1;
    }
}
