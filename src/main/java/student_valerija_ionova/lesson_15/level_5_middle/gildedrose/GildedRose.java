package student_valerija_ionova.lesson_15.level_5_middle.gildedrose;

import java.util.List;
import java.util.stream.Collectors;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class GildedRose {

	public void updateQuality(List<Item> items) {
		items.stream()
				.map(item -> updateParametersOfItem(item))
				.collect(Collectors.toList());
	}

	Item updateParametersOfItem (Item itemToUpdate){

		if (itemToUpdate.getName().equals("Aged Brie")) {
			return new AgedBrieItem().itemParametersNextDay(itemToUpdate);
		}
		if (itemToUpdate.getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
			return new Backstage().itemParametersNextDay(itemToUpdate);
		}
		if (itemToUpdate.getName().equals("Sulfuras, Hand of Ragnaros")) {
			return new SulfurasItem().itemParametersNextDay(itemToUpdate);
		}
		if (itemToUpdate.getName().equals("Conjured Mana Cake")) {
			return new ConjuredItem().itemParametersNextDay(itemToUpdate);
		}
		return new TypicalItem().itemParametersNextDay(itemToUpdate);

	}
}