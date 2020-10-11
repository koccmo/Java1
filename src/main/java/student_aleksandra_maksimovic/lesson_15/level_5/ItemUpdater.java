package student_aleksandra_maksimovic.lesson_15.level_5;

public class ItemUpdater {
    public static void UpdateQuality(Item item, int delta) {
        int quality = item.getQuality() + delta;
        if (quality < 0) {
            quality = 0;
        } else if (quality > 50) {
            quality = 50;
        }
        item.setQuality(quality);
    }

    public static void UpdateSellIn(Item item, int delta) {
        int sellIn = item.getSellIn() + delta;
        if (sellIn < 0) {
            sellIn = 0;
        }
        item.setSellIn(sellIn);
    }
}
