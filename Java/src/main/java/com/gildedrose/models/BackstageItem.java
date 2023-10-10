package com.gildedrose.models;

import com.gildedrose.models.contracts.UpdatableItem;

public class BackstageItem extends UpdatableItem {
    public BackstageItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public void updateQuality(){
        this.updateSellIn();
        if(this.sellIn >= 0){
            if (this.sellIn <= 10 && this.sellIn > 5){
                this.quality = Math.min( quality + 2, 50 );
            }
            else if(sellIn <= 5){
                this.quality = Math.min( quality + 3, 50 );
            }
            else{
                this.quality = Math.min( quality + 1, 50 );
            }
        }
        else{
            this.quality = 0;
        }
    }

    private void updateSellIn(){
        this.sellIn -= 1;
    }
}
