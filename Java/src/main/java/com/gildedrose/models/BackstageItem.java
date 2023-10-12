package com.gildedrose.models;

import com.gildedrose.models.contracts.EspecialItems;
import com.gildedrose.models.contracts.UpdatableItem;

public class BackstageItem extends EspecialItems {

    public BackstageItem(UpdatableItem item) {
        super(item);
    }

    public void updateItemQuality(){
        if(item.getSellIn() >= 0){
            if (item.getSellIn() <= 10 && item.getSellIn() > 5){
                item.setQuality(Math.min( item.getQuality() + 2, 50 ));
            }
            else if(item.getSellIn() <= 5){
                item.setQuality(Math.min( item.getQuality() + 3, 50 ));
            }
            else{
                item.setQuality(Math.min( item.getQuality() + 1, 50 ));
            }
        }
        else{
            item.setQuality(0);
        }
    }
}
