package com.gildedrose.models.contracts;

import com.gildedrose.models.LegendaryItem;
import com.gildedrose.models.NormalItem;

public abstract class EspecialItems implements UpdatableItem{

    protected UpdatableItem item;

    public EspecialItems(UpdatableItem item) {
        this.item = item;
    }

    @Override
    public String getName() {
        return item.getName();
    }

    @Override
    public int getSellIn() {
        return item.getSellIn();
    }

    @Override
    public int getQuality() {
        return item.getQuality();
    }

    @Override
    public void setName(String name) {
        item.setName(name);
    }

    @Override
    public void setSellIn(int sellIn) {
        item.setSellIn(sellIn);
    }

    @Override
    public void setQuality(int quality) {
        item.setQuality(quality);
    }

    @Override
    public void updateQuality() {
        if (item instanceof LegendaryItem || this instanceof LegendaryItem){
            item.setQuality(80);
        }
        else {
            updateItemQuality();
            if(!(item instanceof NormalItem)){
                item.updateQuality();
            }
        }
    }

    public abstract void updateItemQuality();

    @Override
    public void updateSellIn() {
        if (item instanceof LegendaryItem || this instanceof LegendaryItem){
            item.setSellIn(item.getSellIn());
        }
        else {
            item.setSellIn(item.getSellIn()-1);
        }
    }

    @Override
    public String toString() {
        return item.getName() + ", " + item.getSellIn() + ", " + item.getQuality();
    }
}
