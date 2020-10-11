package student_aleksandra_maksimovic.lesson_15.level_5;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/*


- At the end of each day our system lowers both values for every item.
- Once the sell by date has passed, Quality degrades twice as fast.
- The Quality of an item is never negative.

- “Aged Brie” actually increases in Quality the older it gets.
- The Quality of an item is never more than 50.




- “Sulfuras”, being a legendary item,
  never has to be sold or decreases in Quality.


- “Backstage passes”, like aged brie, increases in
  Quality as it’s SellIn value approaches;
  Quality increases by 2 when there are 10 days
  or less and by 3 when there are 5 days or less
  but Quality drops to 0 after the concert.

  - “Conjured” items degrade in Quality twice as fast as normal items.

 */

public class GildedRoseTest {
    GildedRose gildedRose;

    @Before
    public void init() {
        gildedRose = new GildedRose();
    }

    @Test
    public void lowersBothValuesForEveryItemEachDayTest() {

        // - At the end of each day our system lowers both values for every item.

        List<Item> items = Arrays.asList(
                new Item("Item1", 10, 10),
                new Item("Item2", 30, 30));

        gildedRose.updateQuality(items);

        assertEquals(items.get(0).getSellIn(), 9);
        assertEquals(items.get(0).getQuality(), 9);

        assertEquals(items.get(1).getSellIn(), 29);
        assertEquals(items.get(1).getQuality(), 29);

    }

    @Test
    public void sellDateHasPassedQualityDegradesTwiceTest() {

        // - Once the sell by date has passed, Quality degrades twice as fast.

        List<Item> items = Arrays.asList(new Item("Item1", 0, 10));

        gildedRose.updateQuality(items);

        assertEquals(items.get(0).getQuality(), 8);
    }

    @Test
    public void qualityIsNeverNegativeTest() {

        // - The Quality of an item is never negative.

        List<Item> items = Arrays.asList(
                new Item("Item1", 0, 1),
                new Item("Item2", 0, 0),
                new Item("Item3", 10, 0),
                new Item("Conjured Mana Cake", 10, 0),
                new Item("Conjured Mana Cake", 10, 1));

        gildedRose.updateQuality(items);

        for (Item item : items) {
            assertTrue(item.getQuality() >= 0);
        }
    }

    @Test
    public void agedBrieQualityIncreasesOlderItGetsTest() {

       // - “Aged Brie” actually increases in Quality the older it gets.

        List<Item> items = Arrays.asList(
                new Item("Aged Brie", 10, 10),
                new Item("Aged Brie", 0, 10));

        gildedRose.updateQuality(items);

        assertEquals(items.get(0).getQuality(), 11);
        assertEquals(items.get(1).getQuality(), 12);
    }

    @Test
    public void qualityNotMore50Test() {

        // - The Quality of an item is never more than 50.

        List<Item> items = Arrays.asList(
                new Item("Aged Brie", 10, 50),
                new Item("Aged Brie", 0, 50),
                new Item("Backstage passes to a TAFKAL80ETC concert", 12, 50));

        gildedRose.updateQuality(items);

        for (Item item : items) {
            assertEquals(item.getQuality(), 50);
        }
    }

    @Test
    public void sulfurasLegendarySellInAndQualityNotDecreases () {

        // - “Sulfuras”, being a legendary item,
        //  never has to be sold or decreases in Quality.

        List<Item> items = Arrays.asList(
                new Item("Sulfuras, Hand of Ragnaros", 10, 10),
                new Item("Sulfuras, Hand of Ragnaros", 0, 10));

        gildedRose.updateQuality(items);

        assertEquals(items.get(0).getSellIn(), 10);
        assertEquals(items.get(0).getQuality(), 10);

        assertEquals(items.get(1).getSellIn(), 0);
        assertEquals(items.get(1).getQuality(), 10);
    }

    @Test
    public void BackstagePassesQualityTest() {
        // - “Backstage passes”, like aged brie, increases in
        //  Quality as it’s SellIn value approaches;
        //  Quality increases by 2 when there are 10 days
        //  or less and by 3 when there are 5 days or less
        //  but Quality drops to 0 after the concert.

        List<Item> items = Arrays.asList(
                new Item("Backstage passes to a TAFKAL80ETC concert", 12, 10),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10),
                new Item("Backstage passes to a TAFKAL80ETC concert", 6, 10),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10),
                new Item("Backstage passes to a TAFKAL80ETC concert", 1, 10),
                new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10));

        gildedRose.updateQuality(items);

        assertEquals(items.get(0).getQuality(), 11);
        assertEquals(items.get(1).getQuality(), 12);
        assertEquals(items.get(2).getQuality(), 12);
        assertEquals(items.get(3).getQuality(), 13);
        assertEquals(items.get(4).getQuality(), 13);
        assertEquals(items.get(5).getQuality(), 0);
    }

    @Test
    public void conjuredItemsQualityDegradesTwiceTest () {
        // - “Conjured” items degrade in Quality twice as fast as normal items.

        List<Item> items = Arrays.asList(new Item("Conjured Mana Cake", 10, 10));

        gildedRose.updateQuality(items);

        assertEquals(items.get(0).getQuality(), 8);
    }
}