package student_eduards_jasvins.lesson_15.day_5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class GildedRoseTest {

    GildedRose gildedRose = new GildedRose();
    List <Item> item = new ArrayList<>();
    Item vest = new Item ("+5 Dexterity Vest", 10, 20);
    Item brie = new Item ("Aged Brie", 2, 0);
    Item elixir = new Item ("Elixir of the Mongoose", 5, 7);
    Item sulfuras = new Item ("Sulfuras, Hand of Ragnaros", 0, 80);
    Item backstage = new Item ("Backstage passes to a TAFKAL80ETC concert", 15, 20);
    Item cake = new Item ("Conjured Mana Cake", 3, 6);
    Item firstPasses = new Item ("Backstage passes to a TAFKAL80ETC concert", 10, 20);
    Item secondPasses = new Item ("Backstage passes to a TAFKAL80ETC concert", 5, 20);
    Item thirdPasses = new Item ("Backstage passes to a TAFKAL80ETC concert", 15, 20);
    Item agedBrie = new Item ("Aged Brie", 2, 49);
    Item normalItem = new Item ("+5 Dexterity Vest", 10, 20);


    @Test
    public void updateQualityNormalItemV1() {
        item.add(vest);
        gildedRose.updateQuality(item);
        assertEquals(vest.getSellIn(), 0);
        assertEquals(vest.getQuality(), 21);
    }

    @Test
    public void updateQualityNormalItemV2() {
        item.add(elixir);
        gildedRose.updateQuality(item);
        assertEquals(elixir.getSellIn(), 0);
        assertEquals(elixir.getQuality(), 9);
    }

    @Test
    public void updateQualityNormalItemV3() {
        item.add(brie);
        gildedRose.updateQuality(item);
        assertEquals(brie.getSellIn(), 2);
        assertEquals(brie.getQuality(), 0);
    }

    @Test
    public void updateQualityBackStagePassesV1() {
        item.add(backstage);
        gildedRose.updateQuality(item);
        assertEquals(backstage.getSellIn(), 0);
        assertEquals(backstage.getQuality(), 20);
    }

    @Test
    public void updateQualitySulfuras() {
        item.add(sulfuras);
        gildedRose.updateQuality(item);
        assertEquals(sulfuras.getSellIn(),0);
        assertEquals(sulfuras.getQuality(), 80);
    }

    @Test
    public void updateQualityCake() {
        item.add(cake);
        gildedRose.updateQuality(item);;
        assertEquals(cake.getSellIn(),3);
        assertEquals(cake.getQuality(), 6);
    }


    @Test
    public void updateQualityBackStagePassesV3() {
        item.add(firstPasses);
        gildedRose.updateQuality(item);
        assertEquals(firstPasses.getSellIn(), 0);
        assertEquals(firstPasses.getQuality(), 21);
    }

    @Test
    public void updateQualityBackStagePassesV4() {
        item.add(secondPasses);
        gildedRose.updateQuality(item);
        assertEquals(secondPasses.getSellIn(), 0);
        assertEquals(secondPasses.getQuality(), 22);
    }

    @Test
    public void updateQualityBackStagePassesV5() {
        item.add(thirdPasses);
        gildedRose.updateQuality(item);
        assertEquals(thirdPasses.getSellIn(), 0);
        assertEquals(thirdPasses.getQuality(), 20);
    }

    @Test
    public void updateQualityNormalItemV4() {
        item.add(agedBrie);
        gildedRose.updateQuality(item);
        assertEquals(agedBrie.getSellIn(), 2);
        assertEquals(agedBrie.getQuality(), 49);
    }
    @Test
    public void updateQualityNormalItemV5() {
        item.add(normalItem);
        gildedRose.updateQuality(item);
        assertEquals(normalItem.getSellIn(), 0);
        assertEquals(normalItem.getQuality(), 21);
    }

}