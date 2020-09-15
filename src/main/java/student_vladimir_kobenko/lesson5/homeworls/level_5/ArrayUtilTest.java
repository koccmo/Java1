package student_vladimir_kobenko.lesson5.homeworls.level_5;

public class ArrayUtilTest {
    public static void main (String[] args) {
    ArrayUtilTest test = new ArrayUtilTest();

    test.shouldCreateArray();
    test.shouldFillArrayWithRandomNumbers();
    test.shouldFindMaxNumber();
    test.shouldFindMinNumber();
    }

    public void shouldCreateArray () {
    ArrayUtil arrayUtil = new ArrayUtil();
    int testArray [] = arrayUtil.shouldCreateArray(10);

    if(testArray.length ==10) {
    System.out.println("Array created correctly");
    }
    else {
    System.out.println("Array creation failed");
         }
    }

    public void shouldFillArrayWithRandomNumbers() {
    ArrayUtil arrayUtil = new ArrayUtil();
    int[] array = arrayUtil.fillArrayWithRandomNumbers(new int[5]);

    }

    public void shouldFindMaxNumber(){
    ArrayUtil arrayUtil = new ArrayUtil();
    int [] array = {10, 3, 25, 65, 2, 0};
    if (arrayUtil.findMaxNumber(array) == 65){
    System.out.println("Max number test is Ok");
    }else{
    System.out.println("Max number test is failed");
    }
    }

    public void shouldFindMinNumber() {
    ArrayUtil arrayUtil = new ArrayUtil();
    int [] array = {1, 3, 5, 7, 8, 0};
    if (arrayUtil.findMinNumber(array) == 0){
    System.out.println("Min number test is Ok");
    }else{
    System.out.println("Min number test is failed");
    }
   }

}
