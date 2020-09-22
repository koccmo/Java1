package teacher.lesson_14.lessoncode;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class FruitStoreTest {

	@Test
	public void testFindApples() {
		FruitStore store = new FruitStore();
		List<Fruit> apples = store.findFruits(new ApplesSearchCriteria());
		assertEquals(apples.size(), 2);
	}

	@Test
	public void testFindPears() {
		FruitStore store = new FruitStore();
		List<Fruit> pears = store.findFruits(new PearsSearchCriteria());
		assertEquals(pears.size(), 2);
	}

	@Test
	public void testFindTomatos() {
		FruitStore store = new FruitStore();
		List<Fruit> tomatos = store.findFruits(new TomatosSearchCriteria());
		assertEquals(tomatos.size(), 1);
	}


}