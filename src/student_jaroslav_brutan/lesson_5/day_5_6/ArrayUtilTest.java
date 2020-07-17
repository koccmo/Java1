package student_jaroslav_brutan.lesson_5.day_5_6;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

    }
    public void shouldCreateArray(){
        ArrayUtil shouldCreateArray = new ArrayUtil();
        int[] createArray = shouldCreateArray.createArray(4);
        if (createArray.length == 4){
            System.out.println("Test - OK!");
        } else {
            System.out.println("Test - FALSE!");
        }
    }
    public void shouldFindMaxNumber(){
        ArrayUtil findMaxNumber = new ArrayUtil();
        int[] array = {2, 4, 6, 8, 10};
        if ((findMaxNumber.findMaxNumber(array)) == 10){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FALSE");
        }
    }
    public void shouldFindMinNumber(){
        ArrayUtil findMinNumber = new ArrayUtil();
        int[] araay = {10, 9, 7, 5, 2};
        if ((findMinNumber.findMinNumber(araay)) == 2){
            System.out.println("Test - OK");
        } else {
            System.out.println("Test - FALSE");
        }
    }
}
