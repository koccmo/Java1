package student_aleksandra_maksimovic.lesson_15.level_5;

public class ConjuredItemUpdateRule implements ItemUpdateRule {
    @Override
    public void update(Item item) {
        //   - “Conjured” items degrade in Quality twice as fast as normal items.
        ItemUpdater.UpdateQuality(item, -2);
        ItemUpdater.UpdateSellIn(item, -1);
    }
}
