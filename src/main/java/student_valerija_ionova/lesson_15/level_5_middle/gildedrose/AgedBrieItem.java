package student_valerija_ionova.lesson_15.level_5_middle.gildedrose;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class AgedBrieItem implements  ProductType{

    @Override
    public Item itemParametersNextDay(Item item) {
        Item updatedItem = item;

        if (item.getSellIn() > 0){
            updatedItem.setQuality(Math.min(50, item.getQuality() + 1));
        }else{
            updatedItem.setQuality(Math.min(50, item.getQuality() + 2));
        }
        updatedItem.setSellIn(item.getSellIn()-1);

        return updatedItem;
    }
}
