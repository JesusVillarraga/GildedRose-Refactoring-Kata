package com.gildedrose.models.contracts;

import com.gildedrose.Item;
import com.gildedrose.models.LegendaryItem;
import com.gildedrose.models.NormalItem;

public interface UpdatableItem {

    String getName();
    int getSellIn();
    int getQuality();

    void setName(String name);
    void setSellIn(int sellIn);
    void setQuality(int quality);

    public void updateQuality();

    public void updateSellIn();
}
