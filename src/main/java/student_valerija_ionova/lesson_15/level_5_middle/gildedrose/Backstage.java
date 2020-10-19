package student_valerija_ionova.lesson_15.level_5_middle.gildedrose;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Backstage implements ProductType{

    @Override
    public Item itemParametersNextDay(Item item) {
        Item updatedItem = item;

        if (item.getSellIn() <= 0){
            updatedItem.setQuality(0);
        }else if (item.getSellIn() <= 5){
            updatedItem.setQuality(Math.min(50, item.getQuality() + 3));
        }else if (item.getSellIn() <= 10){
            updatedItem.setQuality(Math.min(50, item.getQuality() + 2));
        }else {
            updatedItem.setQuality(Math.min(50, item.getQuality() + 1));
        }
        updatedItem.setSellIn(item.getSellIn()-1);
        return updatedItem;
    }

}
