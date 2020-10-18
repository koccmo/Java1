package student_aleksandra_maksimovic.lesson_15.level_5;

import java.util.*;

public class GildedRose {

    ItemUpdateRule simpleRule;
    Map<String, ItemUpdateRule> customRules;

    public GildedRose() {
        simpleRule = new SimpleItemUpdateRule();

        customRules = new HashMap<>();
        customRules.put("Aged Brie", new AgedBrieItemUpdateRule());
        customRules.put("Sulfuras, Hand of Ragnaros", new SulfurasItemUpdateRule());
        customRules.put("Backstage passes to a TAFKAL80ETC concert", new BackstagePassesItemUpdateRule());
        customRules.put("Conjured Mana Cake", new ConjuredItemUpdateRule());

    }

    public void updateQuality(List<Item> items) {
       for (Item item : items) {
           ItemUpdateRule rule = customRules.getOrDefault(item.getName(), simpleRule);
           rule.update(item);
       }
    }

}