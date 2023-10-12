package com.gildedrose;

import com.gildedrose.models.contracts.UpdatableItem;

class GildedRose {
    UpdatableItem[] items;

    public GildedRose(UpdatableItem[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (UpdatableItem item : items) {
            item.updateSellIn();
            item.updateQuality();
        }
    }
}
