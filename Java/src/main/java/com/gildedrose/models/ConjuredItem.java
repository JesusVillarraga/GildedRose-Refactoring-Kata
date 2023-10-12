package com.gildedrose.models;

import com.gildedrose.models.contracts.EspecialItems;
import com.gildedrose.models.contracts.UpdatableItem;

public class ConjuredItem extends EspecialItems {

    public ConjuredItem(UpdatableItem item) {
        super(item);
    }

    public void updateItemQuality(){
        item.setQuality(Math.max( item.getQuality() - 2, 0 ));
    }
}
