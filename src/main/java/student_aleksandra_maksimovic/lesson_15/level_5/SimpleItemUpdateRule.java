package student_aleksandra_maksimovic.lesson_15.level_5;

import java.util.Optional; // unused import statement

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class SimpleItemUpdateRule implements ItemUpdateRule {

    @Override
    public void update(Item item) {

        ItemUpdater.UpdateQuality(item, item.getSellIn() > 0 ? -1 : -2);
        ItemUpdater.UpdateSellIn(item, -1);

    }
}
