package com.gildedrose.models;

import com.gildedrose.models.contracts.EspecialItems;
import com.gildedrose.models.contracts.UpdatableItem;


public class AgedItem extends EspecialItems {


    public AgedItem(UpdatableItem item) {
        super(item);
    }

    @Override
    public void updateItemQuality() {
        if(item.getSellIn() >= 0){
            item.setQuality(Math.min( item.getQuality() + 1, 50 ));
        }
        else{
            item.setQuality(Math.min( item.getQuality() + 2, 50 ));
        }
    }
}
