package com.gildedrose.models;

import com.gildedrose.models.contracts.UpdatableItem;


public class AgedItem extends UpdatableItem {

    public AgedItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        this.updateSellIn();

        if(this.sellIn >= 0){
            this.quality = Math.min( quality + 1, 50 );
        }
        else{
            this.quality = Math.min( quality + 2, 50 );
        }
    }

    private void updateSellIn(){
        this.sellIn -= 1;
    }
}
