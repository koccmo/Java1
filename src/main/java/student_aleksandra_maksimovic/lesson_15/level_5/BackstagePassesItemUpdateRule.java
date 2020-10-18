package student_aleksandra_maksimovic.lesson_15.level_5;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class BackstagePassesItemUpdateRule implements ItemUpdateRule {
    @Override
    public void update(Item item) {

        // - “Backstage passes”, like aged brie, increases in
        //  Quality as it’s SellIn value approaches;
        //  Quality increases by 2 when there are 10 days
        //  or less and by 3 when there are 5 days or less
        //  but Quality drops to 0 after the concert.

        int delta = 0;
        int sellIn = item.getSellIn();

        if (sellIn == 0) {
            delta = - item.getQuality();
        } else if (sellIn <= 5) {
            delta = 3;
        } else if (sellIn <= 10) {
            delta = 2;
        } else {
            delta = 1;
        }

        ItemUpdater.UpdateQuality(item, delta);

        ItemUpdater.UpdateSellIn(item, -1);
    }
}
