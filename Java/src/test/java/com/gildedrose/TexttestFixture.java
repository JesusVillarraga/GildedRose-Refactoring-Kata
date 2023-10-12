package com.gildedrose;

import com.gildedrose.models.*;
import com.gildedrose.models.contracts.UpdatableItem;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        UpdatableItem[] items = new UpdatableItem[] {
            //new NormalItem(new Item("+5 Dexterity Vest", 10, 20)), //
            //new AgedItem(new NormalItem(new Item("Aged Brie", 2, 0))), //
            //new ConjuredItem(new LegendaryItem(new NormalItem(new Item("Conjured Legendary Elixir of the Mongoose", 5, 80)))), //
                //new LegendaryItem(new NormalItem(new Item("Sulfuras, Hand of Ragnaros", 0, 80))), //
            //new LegendaryItem(new NormalItem(new Item("Sulfuras, Hand of Ragnaros", -1, 80))),
            //new BackstageItem(new NormalItem(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20))),
            // new BackstageItem(new NormalItem(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49))),
                new BackstageItem(new NormalItem(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20))),
                // this conjured item does not work properly yet - Fixed
            //new ConjuredItem(new NormalItem(new Item("Conjured Mana Cake", 3, 6)))
        };

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (UpdatableItem item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
