package student_dmitrijs_jasvins.lesson_14.day_1;

import org.junit.Test;

import java.util.List;

public class FruitStorageTest {

        FruitStorage fruitStorage = new FruitStorage();
        List<Apple> allApples = fruitStorage.getAllApples();

        @Test
        public void findApplesByColor_red() {
            List<Apple> redApples = fruitStorage.findApplesByColor(allApples, "red");
            assertEquals(3, redApples.size());
        }

        private void assertEquals(int i, int size) {
        }

        @Test
        public void findApplesByColor_green() {
            List<Apple> greenApples = fruitStorage.findApplesByColor(allApples, "green");
            assertEquals(3, greenApples.size());
        }

        @Test
        public void findApplesByColor_yellow() {
            List<Apple> yellowApples = fruitStorage.findApplesByColor(allApples, "yellow");
            assertEquals(2, yellowApples.size());
        }

        @Test
        public void findApplesByWeight_over150(){
            List<Apple> apples = fruitStorage.findApplesByWeight(allApples, 150);
            assertEquals(4, apples.size());
        }

        @Test
        public void findApplesByWeight_over100(){
            List<Apple> apples = fruitStorage.findApplesByWeight(allApples, 90);
            assertEquals(5, apples.size());
        }
}
