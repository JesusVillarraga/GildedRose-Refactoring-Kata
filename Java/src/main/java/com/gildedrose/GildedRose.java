package com.gildedrose;

import com.gildedrose.models.contracts.UpdatableItem;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            this.updateQualityItem((UpdatableItem) item);
        }
    }

    private void updateQualityItem(UpdatableItem item){
        item.updateQuality();
    }
}
