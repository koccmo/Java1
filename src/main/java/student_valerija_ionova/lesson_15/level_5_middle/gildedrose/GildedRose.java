package student_valerija_ionova.lesson_15.level_5_middle.gildedrose;

import java.util.List;
import java.util.stream.Collectors;

class GildedRose {

	public void updateQuality(List<Item> items) {
		items.stream()
				.map(item -> updateParametersOfItem(item))
				.collect(Collectors.toList());
	}

	Item updateParametersOfItem (Item itemToUpdate){

			if ((!"Aged Brie".equals(itemToUpdate.getName())) && !"Backstage passes to a TAFKAL80ETC concert".equals(itemToUpdate.getName())) {
				if (itemToUpdate.getQuality() > 0) {
					if (!"Sulfuras, Hand of Ragnaros".equals(itemToUpdate.getName())) {
						itemToUpdate.setQuality(itemToUpdate.getQuality() - 1);
					}
				}
			}
			else {
				if (itemToUpdate.getQuality() < 50) {
					itemToUpdate.setQuality(itemToUpdate.getQuality() + 1);

					if ("Backstage passes to a TAFKAL80ETC concert".equals(itemToUpdate.getName())) {
						if (itemToUpdate.getSellIn() < 11) {
							if (itemToUpdate.getQuality() < 50) {
								itemToUpdate.setQuality(itemToUpdate.getQuality() + 1);
							}
						}

						if (itemToUpdate.getSellIn() < 6) {
							if (itemToUpdate.getQuality() < 50) {
								itemToUpdate.setQuality(itemToUpdate.getQuality() + 1);
							}
						}
					}
				}
			}

			if (!"Sulfuras, Hand of Ragnaros".equals(itemToUpdate.getName())) {
				itemToUpdate.setSellIn(itemToUpdate.getSellIn() - 1);
			}

			if (itemToUpdate.getSellIn() < 0) {
				if (!"Aged Brie".equals(itemToUpdate.getName())) {
					if (!"Backstage passes to a TAFKAL80ETC concert".equals(itemToUpdate.getName())) {
						if (itemToUpdate.getQuality() > 0) {
							if (!"Sulfuras, Hand of Ragnaros".equals(itemToUpdate.getName())) {
								itemToUpdate.setQuality(itemToUpdate.getQuality() - 1);
							}
						}
					}
					else {
						itemToUpdate.setQuality(itemToUpdate.getQuality() - itemToUpdate.getQuality());
					}
				}
				else {
					if (itemToUpdate.getQuality() < 50) {
						itemToUpdate.setQuality(itemToUpdate.getQuality() + 1);
					}
				}
			}
		return itemToUpdate;
	}

}