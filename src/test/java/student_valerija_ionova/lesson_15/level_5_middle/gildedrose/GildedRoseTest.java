package student_valerija_ionova.lesson_15.level_5_middle.gildedrose;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void acceptanceTestPlus5DexterityVest(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));

        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(items);
        assertEquals(9, items.get(0).getSellIn());
        assertEquals(19, items.get(0).getQuality());
    }

    @Test
    public void acceptanceTestPlus5DexterityVestNotLessThanNull(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("+5 Dexterity Vest", 0, 0));

        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(items);
        assertEquals(-1, items.get(0).getSellIn());
        assertEquals(0, items.get(0).getQuality());
    }

    @Test
    public void acceptanceTestPlus5DexterityVestQualityDecreasesFaster(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("+5 Dexterity Vest", 0, 10));

        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(items);
        assertEquals(-1, items.get(0).getSellIn());
        assertEquals(8, items.get(0).getQuality());
    }

    @Test
    public void acceptanceTestAgedBrie(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Aged Brie", 2, 0));

        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(items);
        assertEquals(1, items.get(0).getSellIn());
        assertEquals(1, items.get(0).getQuality());
    }

    @Test
    public void acceptanceTestAgedBrieNotMoreThan50Quality(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Aged Brie", 2, 50));

        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(items);
        assertEquals(1, items.get(0).getSellIn());
        assertEquals(50, items.get(0).getQuality());
    }

    @Test
    public void acceptanceTestAgedBrieDaySPassed(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Aged Brie", 0, 30));

        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(items);
        assertEquals(-1, items.get(0).getSellIn());
        assertEquals(32, items.get(0).getQuality());
    }

    @Test
    public void acceptanceTestElixirOfTheMongoose(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Elixir of the Mongoose", 5, 7));

        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(items);
        assertEquals(4, items.get(0).getSellIn());
        assertEquals(6, items.get(0).getQuality());
    }

    @Test
    public void acceptanceTestSulfuras(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));

        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(items);
        assertEquals(0, items.get(0).getSellIn());
        assertEquals(80, items.get(0).getQuality());
    }

    @Test
    public void acceptanceTestSulfuras2(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Sulfuras, Hand of Ragnaros", 10, 80));

        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(items);
        assertEquals(10, items.get(0).getSellIn());
        assertEquals(80, items.get(0).getQuality());
    }

    @Test
    public void acceptanceTestBackstage(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));

        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(items);
        assertEquals(14, items.get(0).getSellIn());
        assertEquals(21, items.get(0).getQuality());
    }

    @Test
    public void acceptanceTestBackstageLessThanTenDays(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 9, 20));

        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(items);
        assertEquals(8, items.get(0).getSellIn());
        assertEquals(22, items.get(0).getQuality());
    }

    @Test
    public void acceptanceTestBackstageEqualsFiveDays(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20));

        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(items);
        assertEquals(4, items.get(0).getSellIn());
        assertEquals(23, items.get(0).getQuality());
    }


    @Test
    public void acceptanceTestBackstageEqualsNullDays(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));

        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(items);
        assertEquals(-1, items.get(0).getSellIn());
        assertEquals(0, items.get(0).getQuality());
    }

    @Test
    public void acceptanceTestConjured(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Conjured Mana Cake", 3, 6));

        GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(items);
        assertEquals(2, items.get(0).getSellIn());
        assertEquals(4, items.get(0).getQuality());
    }

}