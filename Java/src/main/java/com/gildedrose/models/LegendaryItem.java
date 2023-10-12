package com.gildedrose.models;

import com.gildedrose.models.contracts.EspecialItems;
import com.gildedrose.models.contracts.UpdatableItem;

public class LegendaryItem extends EspecialItems {

    public LegendaryItem(UpdatableItem item) {
        super(item);
    }

    public void updateItemQuality(){
        item.setQuality(80);
    }
}
