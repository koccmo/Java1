package student_eduards_jasvins.lesson_15.day_5;

import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class GildedRose {

	private final int ZERO_VALUE = 0;
	private final int MAX_QUALITY = 50;
	private final int PASSES_BORDER_TEN = 10;
	private final int PASSES_BORDER_FIVE = 5;

	public void updateQuality(List<Item> items) {
		for (Item item : items) {
			if (isNormalItem(item.getName())) {
				changeValueForNormalItem(item);
			}
			if (isNormalItem(item.getName())) {
				changeValueForAgedBrie(item);
			}
			if (isNormalItem(item.getName())) {
				changeValueForBackStagePasses(item);
			}
			if (isNormalItem(item.getName())) {
				changeValueForConjured(item);
			}
			if (isNormalItem(item.getName())) {
				changeValueForSulfuras(item);
			}
		}

	}

	private void checkSellQuality(Item item) {
		if (item.getSellIn() < ZERO_VALUE) {
			item.setSellIn(ZERO_VALUE);
		}
		if (item.getSellIn() > MAX_QUALITY) {
			item.setSellIn(MAX_QUALITY);
		}
	}

	private void changeValueForNormalItem(Item item) {
		if (isSellDataZero(item)) {
			item.setQuality(item.getQuality() - 2);
		} else {
			item.setSellIn(item.getSellIn() - 1);
			item.setQuality(item.getQuality() - 1);
		}
		checkSellQuality(item);
	}

	private void changeValueForSulfuras(Item item) {
		item.setSellIn(ZERO_VALUE);
		item.setQuality(item.getQuality());
	}

	private void changeValueForConjured(Item item) {
		item.setSellIn(item.getSellIn() -1);
		item.setQuality(item.getQuality() -1);
		checkSellQuality(item);
	}

	private void changeValueForAgedBrie(Item item) {
		item.setSellIn(item.getSellIn() -1);
		item.setQuality(item.getQuality() +1);
		checkSellQuality(item);
	}

	private void changeValueForBackStagePasses(Item item) {
		if (isSaleDateBigger10(item)) {
			item.setSellIn(item.getSellIn() - 1);
			item.setQuality(item.getQuality() +1);
			checkSellQuality(item);
		}
		if (isSaleIsLessThan10BiggerThan5(item)) {
			item.setSellIn(item.getSellIn() -1);
			item.setQuality(item.getQuality() +2);
			checkSellQuality(item);
		}
		if (isSaleLess5AndBiggerThan0(item)) {
			item.setSellIn(item.getSellIn() -1);
			item.setQuality(item.getQuality() +3);
			checkSellQuality(item);
		}
		if (isSellDataZero(item)) {
			item.setSellIn(ZERO_VALUE);
			item.setQuality(ZERO_VALUE);
		}
	}


	private boolean isSulfuras(String itemName) { return itemName.contains("Sulfuras"); }

	private boolean isAgedBrie(String itemName) { return itemName.contains("Aged Brie"); }

	private boolean isBackStagePasses(String itemName) { return itemName.contains("Backstage Passes"); }

	private boolean isConjured(String itemName) { return itemName.contains("Conjured"); }

	private boolean isSaleDateBigger10(Item item) { return item.getSellIn() > PASSES_BORDER_TEN; }

	private boolean isSaleIsLessThan10BiggerThan5(Item item) {
		return item.getSellIn() <= PASSES_BORDER_TEN && item.getSellIn() > PASSES_BORDER_FIVE; }

	private boolean isSaleLess5AndBiggerThan0(Item item) {
		return item.getSellIn() <= PASSES_BORDER_FIVE && item.getSellIn() > ZERO_VALUE; }

	private boolean isSellDataZero(Item item) {
		return item.getSellIn() == ZERO_VALUE; }

	private boolean isNormalItem(String itemName) {
		return !isAgedBrie(itemName) && !isSulfuras(itemName) && !isBackStagePasses(itemName) && !isConjured(itemName); }

}