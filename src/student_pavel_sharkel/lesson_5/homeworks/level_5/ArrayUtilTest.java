package student_pavel_sharkel.lesson_5.homeworks.level_5;

public class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFIllArrayWithRandomNumbers();
    }
        public void shouldCreateArray() {
            ArrayUtil test1 = new ArrayUtil();
            int[] testArray = test1.createArray(5);

            if (testArray.length == 5) {
                System.out.println("Array test is OK");
            } else {
                System.out.println("Array test is FAILED");
            }
        }

        public void shouldFIllArrayWithRandomNumbers() {
            ArrayUtil test2 = new ArrayUtil();
            int[] testArray = test2.createArray(5);
            test2.fillArrayWithRandomNumbers(testArray);

            for (int i = 0; i < testArray.length; i++) {
                if (testArray[i] > 0) {
                    if (i == (testArray.length - 1)) {
                       System.out.println("Random filling test is OK");
                    }
                } else {
                    System.out.println("Random filling test is FAILED");
                }

            }
        }
}
