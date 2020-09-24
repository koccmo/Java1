package student_valerija_ionova.lesson_15.level_5_middle.gildedrose;

class TypicalItem implements ProductType{


    @Override
    public Item itemParametersNextDay(Item item) {
        Item updatedItem = item;
        if (item.getSellIn() > 0){
            updatedItem.setQuality(Math.max(0, item.getQuality()-1));
        }else{
            updatedItem.setQuality(Math.max(0, item.getQuality()-2));
        }
        updatedItem.setSellIn(item.getSellIn()-1);
        return updatedItem;
    }
}
